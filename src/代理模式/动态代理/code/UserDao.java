package 代理模式.动态代理.code;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-21 14:13
 **/
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("-----已保存数据-----");
    }

    @Override
    public void update() {
        System.out.println("-----已更新数据-----");
    }

}
