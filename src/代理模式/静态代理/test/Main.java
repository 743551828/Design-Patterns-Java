package 代理模式.静态代理.test;

import 代理模式.静态代理.code.IUserDao;
import 代理模式.静态代理.code.UserDao;
import 代理模式.静态代理.code.UserDaoProxy;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-21 14:10
 **/
public class Main {

    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        IUserDao userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
