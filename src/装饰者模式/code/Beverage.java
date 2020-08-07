package 装饰者模式.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 饮料被装饰者父类
 * @author: zhangys
 * @create: 2020-08-07 14:33
 **/
public abstract class Beverage {

    protected List<String> descriptions = new ArrayList<>();

    public List<String> getDescriptions() {
        return descriptions;
    }

    public abstract double cost();
}
