package 工厂模式.抽象工厂模式.code.controller.impl.ios;

import 工厂模式.抽象工厂模式.code.controller.OperationController;

/**
 * @author zhangys
 */
public class IosOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("IosOperationController");
    }
}