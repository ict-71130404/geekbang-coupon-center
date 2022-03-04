package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName Product.java
 * @Description TODO
 * @createTime 2022年03月04日 16:06:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long price;
    private Integer count;
    private Long shopId;
}
