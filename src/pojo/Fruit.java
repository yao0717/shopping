package pojo;

import java.math.BigDecimal;

public class Fruit {
    private BigDecimal price; // 价格
    private BigDecimal num; // 数量
    private BigDecimal discount; //折扣

    public Fruit() {
    }

    public Fruit(BigDecimal price, BigDecimal num, BigDecimal discount) {
        this.price = price;
        this.num = num;
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        if (discount == null || discount.compareTo(BigDecimal.ZERO) == 0){
            return new BigDecimal(1);
        }
        return discount.divide(new BigDecimal(10));
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
