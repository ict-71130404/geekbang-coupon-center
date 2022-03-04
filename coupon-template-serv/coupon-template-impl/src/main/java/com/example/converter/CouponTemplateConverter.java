package com.example.converter;

import com.example.beans.CouponTemplateInfo;
import com.example.entity.CouponTemplate;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName CouponTemplateConverter.java
 * @Description TODO
 * @createTime 2022年03月04日 15:15:00
 */
public class CouponTemplateConverter {
    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}
