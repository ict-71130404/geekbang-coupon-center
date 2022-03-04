package com.example.enums;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.stream.Stream;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName CouponType.java
 * @Description TODO
 * @createTime 2022年03月04日 14:02:00
 */
public enum CouponType {
    UNKNOWN("unknown","0"),
    MONEY_OFF("满减券","1"),
    DISCOUNT("打折","2"),
    RANDOM_DISCOUNT("随机减","3"),
    LONELY_NIGHT_MONEY_OFF("晚间双倍优惠券","4");

    private String description;
    private String code;

    public static CouponType convert(String code){
        return Stream.of(values())
                .filter(bean -> bean.code.equalsIgnoreCase(code))
                .findFirst()
                .orElse(UNKNOWN);
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    CouponType(String description, String code) {
        this.description = description;
        this.code = code;
    }
}
