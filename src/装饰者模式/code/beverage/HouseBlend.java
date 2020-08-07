package 装饰者模式.code.beverage;

import 装饰者模式.code.Beverage;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-07 14:43
 **/
public class HouseBlend extends Beverage {

    public HouseBlend(){
        super.descriptions.add("混合咖啡");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
