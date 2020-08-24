package 桥接模式.code.draw.impl;

import 桥接模式.code.draw.DrawAPI;

public class GreenRect implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Rect[ color: green, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}