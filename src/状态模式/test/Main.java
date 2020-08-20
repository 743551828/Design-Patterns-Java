package 状态模式.test;

import 状态模式.code.context.Context;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-20 15:05
 **/
public class Main {

    public static void main(String[] args) {

        Context context = new Context(2);
        context.pay();
        context.make();
        context.give();
        context.pay();
        context.make();
        context.give();
        context.pay();
        context.make();
        context.give();

    }

}
