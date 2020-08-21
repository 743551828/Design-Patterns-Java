package 代理模式.静态代理.code;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-21 14:14
 **/
public class UserDaoProxy implements IUserDao{

    private final IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事物");
        target.save();
        System.out.println("提交事物");
    }

}
