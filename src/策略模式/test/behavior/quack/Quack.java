package 策略模式.test.behavior.quack;

import 策略模式.code.behavior.QuackBehavior;

/**
 * @description: 呱呱叫
 * @author: zhangys
 * @create: 2020-08-04 15:56
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
