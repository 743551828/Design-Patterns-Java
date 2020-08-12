package 工厂模式.抽象工厂模式.code.factory.impl;

import 工厂模式.抽象工厂模式.code.controller.OperationController;
import 工厂模式.抽象工厂模式.code.controller.UIController;
import 工厂模式.抽象工厂模式.code.controller.impl.android.AndroidOperationController;
import 工厂模式.抽象工厂模式.code.controller.impl.android.AndroidUIController;
import 工厂模式.抽象工厂模式.code.factory.SystemFactory;

public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new AndroidUIController();
    }
}