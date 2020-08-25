package 原型模式.code.shape.impl;

import 原型模式.code.shape.Shape;

public class Square extends Shape {
 
   public Square(){
     type = "Square";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}