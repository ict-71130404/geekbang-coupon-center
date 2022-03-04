package com.example.service.intf;

import com.example.ShoppingCart;
import com.example.SimulationOrder;
import com.example.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName CouponCalculationService.java
 * @Description TODO
 * @createTime 2022年03月04日 16:15:00
 */
public interface CouponCalculationService {
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
