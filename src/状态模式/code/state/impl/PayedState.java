package 状态模式.code.state.impl;

import 状态模式.code.context.Context;
import 状态模式.code.state.State;

/**
 * @description: 已付钱状态
 * @author: zhangys
 * @create: 2020-08-20 15:56
 **/
public class PayedState extends State {

    public PayedState(Context context) {
        super(context);
    }

    @Override
    public void pay() {
        System.out.println("已经付过钱了");
    }

    @Override
    public void make() {
        Integer goodsCount = context.getGoodsCount();
        if (goodsCount != 0){
            System.out.println("制作中");
            context.setGoodsCount(goodsCount - 1);
            this.context.setState(new MadeState(this.context));
        }else {
            System.out.println("已售罄");
        }
    }

    @Override
    public void give() {
        System.out.println("还未做好");
    }

    @Override
    public void reback() {
        Integer goodsCount = context.getGoodsCount();
        System.out.println("退款中");
        if (goodsCount != 0) {
            this.context.setState(new NoPayState(this.context));
        }else {
            this.context.setState(new NullGoodsState(this.context));
        }
    }
}
