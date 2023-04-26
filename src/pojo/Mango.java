package pojo;

import java.math.BigDecimal;

/**
 * 芒果
 */
public class Mango extends Fruit {
    public Mango() {
    }

    public Mango(BigDecimal price, BigDecimal num, BigDecimal discount) {
        super(price, num, discount);
    }
}
