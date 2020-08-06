package 策略模式.test.duck;

import 策略模式.code.Duck;
import 策略模式.test.behavior.fly.NoWayFly;
import 策略模式.test.behavior.quack.SQuack;

/**
 * @description: 橡皮鸭子
 * @author: zhangys
 * @create: 2020-08-04 15:58
 **/
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是一只橡皮鸭子");
    }

    public RubberDuck() {
        super.flyBehavior = new NoWayFly();
        super.quackBehavior = new SQuack();
    }
}
