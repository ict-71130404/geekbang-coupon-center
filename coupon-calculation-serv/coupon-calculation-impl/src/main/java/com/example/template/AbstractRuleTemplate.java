package com.example.template;

import com.example.Product;
import com.example.ShoppingCart;
import com.example.beans.CouponTemplateInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName AbstractRuleTemplate.java
 * @Description TODO
 * @createTime 2022年03月04日 16:21:00
 */
@Slf4j
public abstract class AbstractRuleTemplate implements RuleTemplate {
    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        Long orderTotalAmount = getTotalPrice(order.getProducts());

        Map<Long, Long> sumAmount = this.getTotalPriceGroupByShop(order.getProducts());

        CouponTemplateInfo template = order.getCouponInfos().get(0).getTemplate();

        Long threshold = template.getRule().getDiscount().getThreshold();

        Long quota = template.getRule().getDiscount().getQuota();

        Long shopId = template.getShopId();

        Long shopTotalAmount = (shopId == null) ? orderTotalAmount : sumAmount.get(shopId);

        if (shopTotalAmount == null || shopTotalAmount < threshold) {
            log.warn("Totals of amount not meet, ur coupons are not applicable to this order");
            order.setCost(orderTotalAmount);
            order.setCouponInfos(Collections.emptyList());
            return order;
        }

        Long newCost = calculateNewPrice(orderTotalAmount, shopTotalAmount, quota);
        if (newCost < minCost()) {
            newCost = minCost();
        }
        order.setCost(newCost);
        log.debug("original price={}, new price={}", orderTotalAmount, newCost);
        return order;
    }

    abstract Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota);

    protected long minCost() {
        return 1L;
    }

    protected Map<Long, Long> getTotalPriceGroupByShop(List<Product> products) {
        Map<Long, Long> groups = products.stream()
                .collect(Collectors.groupingBy(m -> m.getShopId(),
                        Collectors.summingLong(p -> p.getPrice() * p.getCount()))
                );
        return groups;
    }


    // 计算订单总价
    protected long getTotalPrice(List<Product> products) {
        return products.stream()
                .mapToLong(product -> product.getPrice() * product.getCount())
                .sum();
    }
}
