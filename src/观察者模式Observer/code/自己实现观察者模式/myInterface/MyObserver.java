package 观察者模式Observer.code.自己实现观察者模式.myInterface;

/**
 * @description: 我的观察者接口
 * @author: zhangys
 * @create: 2020-08-06 14:22
 **/
public interface MyObserver {

    void update(MyObservable observable, Object arg);

}
