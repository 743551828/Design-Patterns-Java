package 策略模式.test;

import 策略模式.code.behavior.QuackBehavior;
import 策略模式.test.behavior.fly.NoWayFly;
import 策略模式.test.behavior.quack.SQuack;
import 策略模式.test.duck.RedheadDuck;
import 策略模式.test.duck.RubberDuck;

/**
 * @description: 主函数
 * @author: zhangys
 * @create: 2020-08-04 15:49
 **/
public class main {
    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.perfomFly();
        redheadDuck.setFlyBehavior(new NoWayFly());
        redheadDuck.perfomFly();
        redheadDuck.performQuack();
        redheadDuck.setQuackBehavior(new SQuack());
        redheadDuck.performQuack();
        redheadDuck.setQuackBehavior(() -> System.out.println("自定义鸭子叫"));
        redheadDuck.performQuack();
//        RubberDuck rubberDuck = new RubberDuck();
//        rubberDuck.perfomFly();
//        rubberDuck.performQuack();
    }
}
