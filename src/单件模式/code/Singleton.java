package 单件模式.code;

/**
 * @description: 单例模式
 * @author: zhangys
 * @create: 2020-08-13 14:15
 **/
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void test(){
        System.out.println("test");
    }

}
