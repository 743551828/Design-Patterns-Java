package 命令模式.code.command.impl.light;

import 命令模式.code.command.Command;
import 命令模式.code.entity.LightEntity;

/**
 * @description: 灯打开命令
 * @author: zhangys
 * @create: 2020-08-14 16:09
 **/
public class LightOnCommand implements Command {

    private final LightEntity lightEntity;

    public LightOnCommand(LightEntity lightEntity) {
        this.lightEntity = lightEntity;
    }

    @Override
    public void execute() {
        this.lightEntity.on();
    }

    @Override
    public void undo() {
        this.lightEntity.off();
    }
}
