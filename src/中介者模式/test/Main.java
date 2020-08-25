package 中介者模式.test;

import 中介者模式.code.User;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-25 09:30
 **/
public class Main {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
