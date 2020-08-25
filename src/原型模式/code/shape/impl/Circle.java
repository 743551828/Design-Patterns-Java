package 原型模式.code.shape.impl;

import 原型模式.code.shape.Shape;

public class Circle extends Shape {
 
   public Circle(){
     type = "Circle";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}