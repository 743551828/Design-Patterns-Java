package 适配器模式与外观模式.外观模式.code;

import 适配器模式与外观模式.外观模式.code.shape.Shape;
import 适配器模式与外观模式.外观模式.code.shape.impl.Circle;
import 适配器模式与外观模式.外观模式.code.shape.impl.Rectangle;
import 适配器模式与外观模式.外观模式.code.shape.impl.Square;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:37
 **/
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
