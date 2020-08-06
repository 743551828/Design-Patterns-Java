package 策略模式.code;

import 策略模式.code.behavior.FlyBehavior;
import 策略模式.code.behavior.QuackBehavior;

/**
 * @description: 鸭子模型
 * @author: zhangys
 * @create: 2020-08-04 15:33
 **/
public abstract class Duck {

    /**
     * 飞行行为
     */
    public FlyBehavior flyBehavior;

    /**
     * 呱呱叫行为
     */
    public QuackBehavior quackBehavior;

    /**
     * 飞行
     */
    public void perfomFly(){
        this.flyBehavior.fly();
    }

    /**
     * 呱呱叫
     */
    public void performQuack(){
        this.quackBehavior.quack();
    }

    /**
     * 游泳行为
     */
    public void swim(){
        System.out.println("游泳ing");
    }

    /**
     * 模样
     */
    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

}
