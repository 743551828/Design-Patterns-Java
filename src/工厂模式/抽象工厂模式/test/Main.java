package 工厂模式.抽象工厂模式.test;

import 工厂模式.抽象工厂模式.code.controller.OperationController;
import 工厂模式.抽象工厂模式.code.controller.UIController;
import 工厂模式.抽象工厂模式.code.factory.SystemFactory;
import 工厂模式.抽象工厂模式.code.factory.impl.WpFactory;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 14:13
 **/
public class Main {

    public static void main(String[] args) {
        SystemFactory wpFactory = new WpFactory();
        UIController interfaceController = wpFactory.createInterfaceController();
        OperationController operationController = wpFactory.createOperationController();
        interfaceController.display();
        operationController.control();
    }
}
