package 桥接模式.code.shape.impl;

import 桥接模式.code.draw.DrawAPI;
import 桥接模式.code.shape.Shape;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-24 16:36
 **/
public class Rect extends Shape {

    private int x, y, radius;

    public Rect(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }


}
