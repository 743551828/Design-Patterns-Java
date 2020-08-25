package 原型模式.test;

import 原型模式.code.ShapeCache;
import 原型模式.code.shape.Shape;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-25 09:52
 **/
public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
