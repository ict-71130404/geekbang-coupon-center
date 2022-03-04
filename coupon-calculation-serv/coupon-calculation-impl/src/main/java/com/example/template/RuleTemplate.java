package com.example.template;

import com.example.ShoppingCart;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName RuleTemplate.java
 * @Description TODO
 * @createTime 2022年03月04日 16:20:00
 */
public interface RuleTemplate {
    ShoppingCart calculate(ShoppingCart settlement);
}
