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
 * @ClassName SimulationOrder.java
 * @Description TODO
 * @createTime 2022年03月04日 16:08:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulationOrder {
    @NotEmpty
    private List<Product> products;

    @NotEmpty
    private List<Long> couponIds;

    private List<CouponInfo> couponInfos;

    @NotNull
    private Long userId;
}
