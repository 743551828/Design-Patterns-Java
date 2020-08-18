package 模板方法模式.code.impl;

import 模板方法模式.code.Beverage;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-18 11:26
 **/
public class Tea extends Beverage {

    @Override
    public void prepareIngredients() {
        System.out.println("准备茶叶");
    }

    @Override
    public void filter() {
        System.out.println("过滤");
    }

    @Override
    public void doUp() {
        System.out.println("包装茶");
    }
}
