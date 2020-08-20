package 状态模式.code.state;

import 状态模式.code.context.Context;

/**
 * @description: 状态
 * @author: zhangys
 * @create: 2020-08-20 15:50
 **/
public abstract class State {

    public final Context context;

    public State(Context context) {
        this.context = context;
    }

    /**
     * 付钱
     */
    public abstract void pay();

    /**
     * 制作
     */
    public abstract void make();

    /**
     * 给产品
     */
    public abstract void give();

    /**
     * 退钱
     */
    public abstract void reback();

}
