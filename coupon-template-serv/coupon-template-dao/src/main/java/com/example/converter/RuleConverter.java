package com.example.converter;

import com.alibaba.fastjson.JSON;
import com.example.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName RuleConverter.java
 * @Description TODO
 * @createTime 2022年03月04日 14:37:00
 */

@Converter
public class RuleConverter implements AttributeConverter<TemplateRule, String> {

    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule, TemplateRule.class);
    }
}