package 适配器模式与外观模式.外观模式.code.shape.impl;

import 适配器模式与外观模式.外观模式.code.shape.Shape;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:36
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
