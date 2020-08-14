package 命令模式.code.command.impl;

import 命令模式.code.command.Command;
import 命令模式.code.entity.LightEntity;
import 命令模式.code.entity.TVEntity;

/**
 * @description: 派对命令
 * @author: zhangys
 * @create: 2020-08-14 16:24
 **/
public class PartyCommand implements Command {

    private final LightEntity lightEntity;

    private final TVEntity tvEntity;

    public PartyCommand(LightEntity lightEntity, TVEntity tvEntity) {
        this.lightEntity = lightEntity;
        this.tvEntity = tvEntity;
    }

    @Override
    public void execute() {
        this.lightEntity.on();
        this.tvEntity.on();
        this.tvEntity.turnUpVolume();
    }

    @Override
    public void undo() {
        this.tvEntity.off();
        this.lightEntity.off();
    }
}
