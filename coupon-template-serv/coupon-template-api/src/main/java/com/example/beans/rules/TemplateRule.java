package com.example.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName TemplateRule.java
 * @Description TODO
 * @createTime 2022年03月04日 14:11:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRule {
    private Discount discount;
    private Integer limitation;
    private Long deadline;
}
