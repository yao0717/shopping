package pojo;

import java.math.BigDecimal;

/**
 * 苹果
 */
public class Apple extends Fruit {
    public Apple() {
    }

    public Apple(BigDecimal price, BigDecimal num, BigDecimal discount) {
        super(price, num, discount);
    }
}
