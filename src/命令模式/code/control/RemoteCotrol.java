package 命令模式.code.control;

import 命令模式.code.command.Command;

import java.util.Stack;

/**
 * @description: 遥控器
 * @author: zhangys
 * @create: 2020-08-14 16:30
 **/
public class RemoteCotrol {

    private final Command[][] commands;

    private final Stack<Command> historyCommand;

    public RemoteCotrol(Command[][] commands) {
        assert commands != null;
        this.commands = commands;
        this.historyCommand = new Stack<>();
    }

    public void push(Integer num1, Integer num2){
        Command command = commands[num1][num2];
        command.execute();
        historyCommand.add(command);
    }

    public void undo(){
        Command command = historyCommand.pop();
        if (command != null){
            command.undo();
        }
    }

}
