package 工厂模式.抽象工厂模式.code.factory;

import 工厂模式.抽象工厂模式.code.controller.OperationController;
import 工厂模式.抽象工厂模式.code.controller.UIController;

/**
 * @author zhangys
 */
public interface SystemFactory {
    public OperationController createOperationController();
    public UIController createInterfaceController();
}