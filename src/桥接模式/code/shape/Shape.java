package 桥接模式.code.shape;

import 桥接模式.code.draw.DrawAPI;

public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();  
}