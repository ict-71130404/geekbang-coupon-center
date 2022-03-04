package com.example;

import com.example.beans.CouponInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName ShoppingCart.java
 * @Description TODO
 * @createTime 2022年03月04日 16:05:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    @NotEmpty
    private List<Product> products;

    private Long couponId;
    private List<CouponInfo> couponInfos;

    private Long cost;

    @NotNull
    private Long userId;
}
