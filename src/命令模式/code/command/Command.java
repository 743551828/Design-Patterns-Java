package 命令模式.code.command;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-14 16:02
 **/
public interface Command {

    void execute();

    void undo();

}
