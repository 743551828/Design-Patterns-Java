package 工厂模式.简单工厂模式.code;

import 工厂模式.简单工厂模式.code.shape.Shape;
import 工厂模式.简单工厂模式.code.shape.impl.CircleShape;
import 工厂模式.简单工厂模式.code.shape.impl.RectShape;
import 工厂模式.简单工厂模式.code.shape.impl.TriangleShape;

/**
 * @description: 工厂类
 * @author: zhangys
 * @create: 2020-08-12 09:57
 **/
public class ShapeFactory {

    public static Shape getShape(String type){
        Shape shape = null;
        if ("circle".equalsIgnoreCase(type)){
            shape = new CircleShape();
        } else if ("rect".equalsIgnoreCase(type)){
            shape = new RectShape();
        } else if ("triangle".equalsIgnoreCase(type)){
            shape = new TriangleShape();
        }
        return shape;
    }


}
