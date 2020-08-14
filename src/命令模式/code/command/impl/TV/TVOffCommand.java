package 命令模式.code.command.impl.TV;

import 命令模式.code.command.Command;
import 命令模式.code.entity.TVEntity;

/**
 * @description: 电视关闭命令
 * @author: zhangys
 * @create: 2020-08-14 16:18
 **/
public class TVOffCommand implements Command {

    private final TVEntity tvEntity;

    public TVOffCommand(TVEntity tvEntity) {
        this.tvEntity = tvEntity;
    }

    @Override
    public void execute() {
        this.tvEntity.off();
    }

    @Override
    public void undo() {
        this.tvEntity.on();
    }
}
