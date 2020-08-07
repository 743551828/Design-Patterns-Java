package 装饰者模式.code.decorator;

import 装饰者模式.code.Beverage;
import 装饰者模式.code.CondimentDecorator;

import java.util.List;

/**
 * @description: 摩卡调料类
 * @author: zhangys
 * @create: 2020-08-07 14:46
 **/
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        beverage.getDescriptions().add("摩卡");
        this.beverage = beverage;
    }

    @Override
    public List<String> getDescriptions() {
        return beverage.getDescriptions();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
