package pojo;

import java.math.BigDecimal;

/**
 * 草莓
 */
public class Strawberry extends Fruit {
    public Strawberry() {
    }

    public Strawberry(BigDecimal price, BigDecimal num, BigDecimal discount) {
        super(price, num, discount);
    }
}
