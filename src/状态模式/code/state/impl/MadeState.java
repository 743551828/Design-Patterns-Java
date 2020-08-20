package 状态模式.code.state.impl;

import 状态模式.code.context.Context;
import 状态模式.code.state.State;

/**
 * @description: 已制作
 * @author: zhangys
 * @create: 2020-08-20 16:15
 **/
public class MadeState extends State {

    public MadeState(Context context) {
        super(context);
    }

    @Override
    public void pay() {
        System.out.println("已付钱");
    }

    @Override
    public void make() {
        System.out.println("已制作");
    }

    @Override
    public void give() {
        System.out.println("交付中");
        this.context.setState(new NoPayState(this.context));
    }

    @Override
    public void reback() {
        System.out.println("已制作完毕，不可退款");
    }
}
