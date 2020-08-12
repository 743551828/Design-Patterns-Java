package 工厂模式.简单工厂模式.code.shape.impl;

import 工厂模式.简单工厂模式.code.shape.Shape;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 09:52
 **/
public class CircleShape implements Shape {

    public CircleShape() {
        System.out.println(  "CircleShape: created");
    }

    @Override
    public void draw() {
        System.out.println(  "draw: CircleShape");
    }
}
