package 工厂模式.抽象工厂模式.code.controller.impl.wp;

import 工厂模式.抽象工厂模式.code.controller.OperationController;

public class WpOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("WpOperationController");
    }
}