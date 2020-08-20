package 状态模式.code.context;

import 状态模式.code.state.State;
import 状态模式.code.state.impl.*;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-20 15:52
 **/
public class Context {

    private State noPayState;

    private State PayedState;

    private State madeState;

    private State nullGoodsState;

    private State currentState;

    private Integer goodsCount;

    public Context(Integer goodsCount) {
        noPayState = new NoPayState(this);
        PayedState = new PayedState(this);
        madeState = new MadeState(this);
        nullGoodsState = new NullGoodsState(this);
        if (goodsCount > 0){
            this.currentState = noPayState;
        }else {
            this.currentState = nullGoodsState;
        }
        this.goodsCount = goodsCount;
    }

    public void pay() {
        this.currentState.pay();
    }

    public void make() {
        this.currentState.make();
    }

    public void give() {
        this.currentState.give();
    }

    public void reback() {
        this.currentState.reback();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public Integer getGoodsCount(){
        return this.goodsCount;
    }

    public synchronized void setGoodsCount(Integer goodsCount){
        this.goodsCount = goodsCount;
    }
}
