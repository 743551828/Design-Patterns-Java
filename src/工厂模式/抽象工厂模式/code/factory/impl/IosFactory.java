package 工厂模式.抽象工厂模式.code.factory.impl;

import 工厂模式.抽象工厂模式.code.controller.OperationController;
import 工厂模式.抽象工厂模式.code.controller.UIController;
import 工厂模式.抽象工厂模式.code.controller.impl.ios.IosOperationController;
import 工厂模式.抽象工厂模式.code.controller.impl.ios.IosUIController;
import 工厂模式.抽象工厂模式.code.factory.SystemFactory;

public class IosFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new IosUIController();
    }
}