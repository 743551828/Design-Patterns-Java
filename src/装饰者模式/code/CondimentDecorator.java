package 装饰者模式.code;

import java.util.List;

/**
 * @description: 调料装饰者父类
 * @author: zhangys
 * @create: 2020-08-07 14:37
 **/
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract List<String> getDescriptions();

}
