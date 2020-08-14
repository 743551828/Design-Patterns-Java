package 命令模式.code.command.impl.TV;

import 命令模式.code.command.Command;
import 命令模式.code.entity.TVEntity;

/**
 * @description: 电视音量增大命令
 * @author: zhangys
 * @create: 2020-08-14 16:19
 **/
public class TVUpVolumeCommand implements Command {

    private final TVEntity tvEntity;

    public TVUpVolumeCommand(TVEntity tvEntity) {
        this.tvEntity = tvEntity;
    }

    @Override
    public void execute() {
        this.tvEntity.turnUpVolume();
    }

    @Override
    public void undo() {
        this.tvEntity.turnDownVolume();
    }
}
