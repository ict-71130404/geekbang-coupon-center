package com.example.converter;

import com.example.enums.CouponType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName CouponTypeConverter.java
 * @Description TODO
 * @createTime 2022年03月04日 14:37:00
 */
@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType, String> {

    @Override
    public String convertToDatabaseColumn(CouponType couponCategory) {
        return couponCategory.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String code) {
        return CouponType.convert(code);
    }
}
