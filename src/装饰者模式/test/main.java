package 装饰者模式.test;

import 装饰者模式.code.Beverage;
import 装饰者模式.code.beverage.Espresso;
import 装饰者模式.code.beverage.HouseBlend;
import 装饰者模式.code.decorator.Mike;
import 装饰者模式.code.decorator.Mocha;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-07 15:03
 **/
public class main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println("点了一杯：" + espresso.getDescriptions() + ",$ " + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mike(houseBlend);
        houseBlend = new Mike(houseBlend);
        System.out.println("点了一杯：" + houseBlend.getDescriptions() + ",$ " + houseBlend.cost());

    }

}
