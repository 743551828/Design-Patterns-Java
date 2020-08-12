package 工厂模式.简单工厂模式.test;

import 工厂模式.简单工厂模式.code.ShapeFactory;
import 工厂模式.简单工厂模式.code.shape.Shape;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 10:05
 **/
public class Main {

    public static void main(String[] args) {
        Shape circleShape= ShapeFactory.getShape("circle");
        circleShape.draw();
        Shape rectShape= ShapeFactory.getShape("rect");
        rectShape.draw();
        Shape triangleShape= ShapeFactory.getShape("triangle");
        triangleShape.draw();
    }

}
