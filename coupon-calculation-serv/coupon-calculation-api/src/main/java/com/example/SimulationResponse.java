package com.example;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName SimulationResponse.java
 * @Description TODO
 * @createTime 2022年03月04日 16:09:00
 */
@Data
@NoArgsConstructor
public class SimulationResponse {
    private Long bestCouponId;
    private Map<Long, Long> couponToOrderPrice = Maps.newHashMap();
}
