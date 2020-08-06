package 策略模式.test.duck;

import 策略模式.code.Duck;
import 策略模式.test.behavior.fly.RocketFly;
import 策略模式.test.behavior.quack.Quack;

/**
 * @description: 红头鸭子
 * @author: zhangys
 * @create: 2020-08-04 15:58
 **/
public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是一只红头鸭子");
    }

    public RedheadDuck() {
        super.flyBehavior = new RocketFly();
        super.quackBehavior = new Quack();
    }
}
