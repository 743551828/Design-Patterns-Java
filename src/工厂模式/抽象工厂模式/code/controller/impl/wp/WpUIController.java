package 工厂模式.抽象工厂模式.code.controller.impl.wp;

import 工厂模式.抽象工厂模式.code.controller.UIController;

public class WpUIController implements UIController {
    @Override
    public void display() {
        System.out.println("WpInterfaceController");
    }
}