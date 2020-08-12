package 工厂模式.简单工厂模式.code.shape.impl;

import 工厂模式.简单工厂模式.code.shape.Shape;

/**
 * @author zhangys
 */
public class RectShape implements Shape {

    public RectShape() {
       System.out.println("RectShape: created");
    }

    @Override
    public void draw() {
       System.out.println("draw: RectShape");
    }

}