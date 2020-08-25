package 访问者模式.test;

import 访问者模式.code.Computer;
import 访问者模式.code.ComputerPart;
import 访问者模式.code.ComputerPartDisplayVisitor;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-25 10:26
 **/
public class Main {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
