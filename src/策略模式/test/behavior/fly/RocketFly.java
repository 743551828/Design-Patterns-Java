package 策略模式.test.behavior.fly;

import 策略模式.code.behavior.FlyBehavior;

/**
 * @description: 火箭飞行
 * @author: zhangys
 * @create: 2020-08-04 15:51
 **/
public class RocketFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("火箭飞行动力");
    }

}
