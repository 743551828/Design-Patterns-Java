package 代理模式.动态代理.test;

import 代理模式.动态代理.code.IUserDao;
import 代理模式.动态代理.code.ProxyFactory;
import 代理模式.动态代理.code.UserDao;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-21 14:10
 **/
public class Main {

    public static void main(String[] args) {
        IUserDao target= new UserDao();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        IUserDao proxyInstance = (IUserDao) proxyFactory.getProxyInstance();
        proxyInstance.save();
        proxyInstance.update();

    }
}
