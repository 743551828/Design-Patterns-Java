package 模板方法模式.test;

import 模板方法模式.code.Beverage;
import 模板方法模式.code.impl.Coffee;
import 模板方法模式.code.impl.Tea;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-18 10:13
 **/
public class Main {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        tea.make();
        coffee.make();

    }
}
