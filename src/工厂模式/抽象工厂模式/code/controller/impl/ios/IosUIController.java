package 工厂模式.抽象工厂模式.code.controller.impl.ios;

import 工厂模式.抽象工厂模式.code.controller.UIController;

/**
 * @author zhangys
 */
public class IosUIController implements UIController {
    @Override
    public void display() {
        System.out.println("IosInterfaceController");
    }
}