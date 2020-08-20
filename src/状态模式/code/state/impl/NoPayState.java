package 状态模式.code.state.impl;

import 状态模式.code.context.Context;
import 状态模式.code.state.State;

/**
 * @description: 未付钱状态
 * @author: zhangys
 * @create: 2020-08-20 15:56
 **/
public class NoPayState extends State {

    public NoPayState(Context context) {
        super(context);
    }

    @Override
    public void pay() {
        Integer goodsCount = context.getGoodsCount();
        if (goodsCount != 0){
            System.out.println("付钱中");
            this.context.setState(new PayedState(this.context));
        }else {
            System.out.println("已售罄");
        }
    }

    @Override
    public void make() {
        System.out.println("未付钱");
    }

    @Override
    public void give() {
        System.out.println("未付钱");
    }

    @Override
    public void reback() {
        System.out.println("未付钱");
    }

}
