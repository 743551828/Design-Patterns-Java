package 策略模式.test.behavior.quack;

import 策略模式.code.behavior.QuackBehavior;

/**
 * @description: 吱吱叫
 * @author: zhangys
 * @create: 2020-08-04 15:57
 **/
public class SQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
