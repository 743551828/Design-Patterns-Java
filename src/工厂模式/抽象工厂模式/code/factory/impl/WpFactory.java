package 工厂模式.抽象工厂模式.code.factory.impl;

import 工厂模式.抽象工厂模式.code.controller.OperationController;
import 工厂模式.抽象工厂模式.code.controller.UIController;
import 工厂模式.抽象工厂模式.code.controller.impl.wp.WpOperationController;
import 工厂模式.抽象工厂模式.code.controller.impl.wp.WpUIController;
import 工厂模式.抽象工厂模式.code.factory.SystemFactory;

public class WpFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new WpOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new WpUIController();
    }
}