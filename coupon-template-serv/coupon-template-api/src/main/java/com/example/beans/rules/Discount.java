package com.example.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName Discount.java
 * @Description TODO
 * @createTime 2022年03月04日 14:14:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {

    // 满减 - 减掉的钱数
    // 折扣 - 90 = 9折,  95=95折
    private Long quota;

    // 最低达到多少消费才能用
    private Long threshold;
}
