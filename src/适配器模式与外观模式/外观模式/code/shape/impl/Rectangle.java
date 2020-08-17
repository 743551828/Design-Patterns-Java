package 适配器模式与外观模式.外观模式.code.shape.impl;

import 适配器模式与外观模式.外观模式.code.shape.Shape;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:34
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
