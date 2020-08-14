package 命令模式.code.command.impl.TV;

import 命令模式.code.command.Command;
import 命令模式.code.entity.TVEntity;

/**
 * @description: 电视打开命令
 * @author: zhangys
 * @create: 2020-08-14 16:14
 **/
public class TVOnCommand implements Command {

    private final TVEntity tvEntity;

    public TVOnCommand(TVEntity tvEntity) {
        this.tvEntity = tvEntity;
    }

    @Override
    public void execute() {
        this.tvEntity.on();
    }

    @Override
    public void undo() {
        this.tvEntity.off();
    }
}
