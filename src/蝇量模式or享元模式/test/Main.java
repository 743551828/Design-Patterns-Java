package 蝇量模式or享元模式.test;

import 蝇量模式or享元模式.code.Circle;
import 蝇量模式or享元模式.code.ShapeFactory;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-24 17:12
 **/
public class Main {

    private static final String[] colors =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
