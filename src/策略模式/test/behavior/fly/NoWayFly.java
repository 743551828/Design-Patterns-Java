package 策略模式.test.behavior.fly;

import 策略模式.code.behavior.FlyBehavior;

/**
 * @description: 不会飞行
 * @author: zhangys
 * @create: 2020-08-04 15:53
 **/
public class NoWayFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
