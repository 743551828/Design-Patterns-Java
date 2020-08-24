package 桥接模式.test;

import 桥接模式.code.draw.impl.GreenCircle;
import 桥接模式.code.draw.impl.GreenRect;
import 桥接模式.code.draw.impl.RedCircle;
import 桥接模式.code.shape.Shape;
import 桥接模式.code.shape.impl.Circle;
import 桥接模式.code.shape.impl.Rect;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-24 16:15
 **/
public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
        Shape greenRect = new Rect(100,100, 10, new GreenRect());
        redCircle.draw();
        greenCircle.draw();
        greenRect.draw();
    }
}
