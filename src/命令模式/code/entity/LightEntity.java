package 命令模式.code.entity;

import 命令模式.code.enums.State;

/**
 * @description: 灯
 * @author: zhangys
 * @create: 2020-08-14 15:20
 **/
public class LightEntity {

    private final String name;

    private State state;

    public LightEntity(String name) {
        this.name = name;
        this.state = State.OFF;
    }

    public void on(){
        state = State.ON;
        System.out.println(name + ":" + state.des);
    }

    public void off(){
        state = State.OFF;
        System.out.println(name + ":" + state.des);
    }

}

