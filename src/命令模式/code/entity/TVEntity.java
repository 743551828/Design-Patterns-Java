package 命令模式.code.entity;

import 命令模式.code.enums.State;
import 命令模式.code.enums.Volume;

/**
 * @description: 电视
 * @author: zhangys
 * @create: 2020-08-14 15:36
 **/
public class TVEntity {

    private final String name;

    private Volume volume;

    private State state;

    public TVEntity(String name){
        this.name = name;
        this.volume = Volume.MIDDLE;
        this.state = State.OFF;
    }

    public void on(){
        this.state = State.ON;
        System.out.println(name + ":" + this.state.des);
    }

    public void off(){
        this.state = State.OFF;
        System.out.println(name + ":" + this.state.des);
    }

    public void turnUpVolume(){
        this.volume = Volume.getHighVolume(this.volume);
        assert this.volume != null;
        System.out.println(name + ":" + this.volume.des);
    }

    public void turnDownVolume(){
        this.volume = Volume.getLowVolume(this.volume);
        assert this.volume != null;
        System.out.println(name + ":" + this.volume.des);
    }

}
