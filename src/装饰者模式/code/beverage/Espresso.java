package 装饰者模式.code.beverage;

import 装饰者模式.code.Beverage;

/**
 * @description: 浓缩咖啡
 * @author: zhangys
 * @create: 2020-08-07 14:41
 **/
public class Espresso extends Beverage {

    public Espresso(){
        super.descriptions.add("浓缩咖啡");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
