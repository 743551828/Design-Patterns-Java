package 命令模式.code.enums;

/**
 * @description: 开关
 * @author zhangys
 */
public enum State{

    ON("打开"),
    OFF("关闭");

    public String des;

    State(String des) {
        this.des = des;
    }

}