package 命令模式.code.command.impl.TV;

import 命令模式.code.command.Command;
import 命令模式.code.entity.TVEntity;

/**
 * @description: 电视音量减小命令
 * @author: zhangys
 * @create: 2020-08-14 16:21
 **/
public class TVDownVolumeCommand implements Command {

    private final TVEntity tvEntity;

    public TVDownVolumeCommand(TVEntity tvEntity) {
        this.tvEntity = tvEntity;
    }

    @Override
    public void execute() {
        this.tvEntity.turnDownVolume();
    }

    @Override
    public void undo() {
        this.tvEntity.turnUpVolume();
    }
}
