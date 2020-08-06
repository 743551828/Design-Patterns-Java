package 观察者模式Observer.code.自己实现观察者模式.myInterface;


import java.util.ArrayList;
import java.util.List;

/**
 * @description: 我的被观察者抽象类
 * @author: zhangys
 * @create: 2020-08-06 14:24
 **/
public abstract class MyObservable {

    private boolean changed = false;

    private List<MyObserver> observerList;

    public MyObservable(){
        observerList = new ArrayList<>();
    }

    public synchronized void addObServer(MyObserver observer){
        if (observer == null){
            throw new NullPointerException();
        }
        if (!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    public synchronized void deleteObserver(MyObserver observer){
        observerList.remove(observer);
    }

    public void notifyObservers(Object arg){
        synchronized (this){
            if (!changed){
                return;
            }
        }
        observerList.forEach(observer -> observer.update(this,arg));
    }

    public void notifyObservers(){
        this.notifyObservers(null);
    }

    public synchronized void setChanged(){
        this.changed = true;
    }

    public synchronized void clearChanged(){
        this.changed = false;
    }
}
