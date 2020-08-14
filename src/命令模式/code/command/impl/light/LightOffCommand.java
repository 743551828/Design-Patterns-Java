package 命令模式.code.command.impl.light;

import 命令模式.code.command.Command;
import 命令模式.code.entity.LightEntity;

/**
 * @description: 灯关闭命令
 * @author: zhangys
 * @create: 2020-08-14 16:13
 **/
public class LightOffCommand implements Command {

    private final LightEntity lightEntity;

    public LightOffCommand(LightEntity lightEntity) {
        this.lightEntity = lightEntity;
    }

    @Override
    public void execute() {
        this.lightEntity.off();
    }

    @Override
    public void undo() {
        this.lightEntity.on();
    }
}
