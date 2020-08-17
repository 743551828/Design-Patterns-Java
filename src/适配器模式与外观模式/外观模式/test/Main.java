package 适配器模式与外观模式.外观模式.test;

import 适配器模式与外观模式.外观模式.code.ShapeMaker;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:33
 **/
public class Main {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();

    }
}
