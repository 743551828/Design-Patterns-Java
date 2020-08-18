package 模板方法模式.code.impl;

import 模板方法模式.code.Beverage;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-18 11:28
 **/
public class Coffee extends Beverage {

    @Override
    public void prepareIngredients() {
        System.out.println("准备咖啡豆");
    }

    @Override
    public void filter() {
        System.out.println("制作咖啡");
    }

    @Override
    public void doUp() {
        System.out.println("包装咖啡");
    }
}
