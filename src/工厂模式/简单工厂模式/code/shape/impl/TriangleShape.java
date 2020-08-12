package 工厂模式.简单工厂模式.code.shape.impl;

import 工厂模式.简单工厂模式.code.shape.Shape;

/**
 * @author zhangys
 */
public class TriangleShape implements Shape {

    public TriangleShape() {
        System.out.println(  "TriangleShape: created");
    }

    @Override
    public void draw() {
        System.out.println(  "draw: TriangleShape");
    }

}