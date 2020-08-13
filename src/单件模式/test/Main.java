package 单件模式.test;

import 单件模式.code.Singleton;

/**
 * @author zhangys
 */
public class Main{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1);
        singleton1.test();
        System.out.println("################################");
        System.out.println(singleton2);
        singleton2.test();
    }
}