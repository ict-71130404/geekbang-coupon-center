package com.example.beans;

import com.example.beans.rules.TemplateRule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName CouponTemplateInfo.java
 * @Description TODO
 * @createTime 2022年03月04日 14:19:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {
    private Long id;
    // 优惠券名字
    @NotNull
    private String name;

    // 优惠券描述
    @NotNull
    private String desc;

    // 优惠券类型
    @NotNull
    private String type;

    // 适用门店 - 若无则为全店通用券
    private Long shopId;

    //优惠券规则
    @NotNull
    private TemplateRule rule;

    private Boolean available;
}
