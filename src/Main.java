import pojo.Apple;
import pojo.Fruit;
import pojo.Mango;
import pojo.Strawberry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public final static String CONSUME = "consume";
    public final static String SUBTRACT = "subtract";

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();
        Apple apple = new Apple(new BigDecimal(8), new BigDecimal(3), null);
        Strawberry strawberry = new Strawberry(new BigDecimal(13), new BigDecimal(3), new BigDecimal(8));
        Mango mango = new Mango(new BigDecimal(20), new BigDecimal(3), null);
        fruits.add(apple);
        fruits.add(strawberry);
        fruits.add(mango);
        Map<String, BigDecimal> fullReductionMap = new HashMap<String, BigDecimal>();
        fullReductionMap.put(CONSUME, new BigDecimal(100));
        fullReductionMap.put(SUBTRACT, new BigDecimal(10));
        System.out.println("购买商品的总价:" + getSum(fruits, true, fullReductionMap));
    }

    /**
     * @param fruits           购买水果
     * @param isFullReduction  是否满减
     * @param fullReductionMap 满减条件
     */
    public static double getSum(List<Fruit> fruits, boolean isFullReduction, Map<String, BigDecimal> fullReductionMap) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Fruit fruit : fruits) {
            BigDecimal price = fruit.getPrice();
            BigDecimal num = fruit.getNum();
            BigDecimal discount = fruit.getDiscount();
            sum = sum.add(price.multiply(num).multiply(discount));
        }
        if (isFullReduction && fullReductionMap != null && sum.compareTo(fullReductionMap.get(CONSUME)) >= 0) {
            sum = sum.subtract(fullReductionMap.get(SUBTRACT));
        }
        return sum.doubleValue();
    }
}
