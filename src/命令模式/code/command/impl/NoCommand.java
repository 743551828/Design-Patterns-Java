package 命令模式.code.command.impl;

import 命令模式.code.command.Command;

/**
 * @description: 空命令
 * @author: zhangys
 * @create: 2020-08-14 16:05
 **/
public class NoCommand implements Command {


    @Override
    public void execute() {
        System.out.println("空执行指令");
    }

    @Override
    public void undo() {
        System.out.println("空撤销指令");
    }
}
