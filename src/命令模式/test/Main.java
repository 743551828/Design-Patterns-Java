package 命令模式.test;

import 命令模式.code.command.Command;
import 命令模式.code.command.impl.TV.TVDownVolumeCommand;
import 命令模式.code.command.impl.TV.TVOffCommand;
import 命令模式.code.command.impl.TV.TVOnCommand;
import 命令模式.code.command.impl.TV.TVUpVolumeCommand;
import 命令模式.code.command.impl.light.LightOffCommand;
import 命令模式.code.command.impl.light.LightOnCommand;
import 命令模式.code.control.RemoteCotrol;
import 命令模式.code.entity.LightEntity;
import 命令模式.code.entity.TVEntity;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-14 16:45
 **/
public class Main {

    public static void main(String[] args) {
        LightEntity lightEntity = new LightEntity("灯");
        TVEntity tvEntity = new TVEntity("电视");

        LightOnCommand lightOnCommand = new LightOnCommand(lightEntity);
        LightOffCommand lightOffCommand = new LightOffCommand(lightEntity);
        TVOnCommand tvOnCommand = new TVOnCommand(tvEntity);
        TVOffCommand tvOffCommand = new TVOffCommand(tvEntity);
        TVUpVolumeCommand tvUpVolumeCommand = new TVUpVolumeCommand(tvEntity);
        TVDownVolumeCommand tvDownVolumeCommand = new TVDownVolumeCommand(tvEntity);

        Command[][] commands = {
                {lightOnCommand,lightOffCommand},
                {tvOnCommand,tvOffCommand},
                {tvUpVolumeCommand,tvDownVolumeCommand}
        };

        RemoteCotrol remoteCotrol = new RemoteCotrol(commands);
        remoteCotrol.push(0,0);
        remoteCotrol.push(0,1);
        remoteCotrol.push(1,0);
        remoteCotrol.push(1,1);
        remoteCotrol.push(2,0);
        remoteCotrol.push(2,1);
        remoteCotrol.undo();
        remoteCotrol.undo();
        remoteCotrol.undo();
        remoteCotrol.undo();
        remoteCotrol.undo();
        remoteCotrol.undo();

    }

}
