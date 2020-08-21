package 代理模式.动态代理.code;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-21 14:31
 **/
public class ProxyFactory {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("-----动态代理开始-----");
                        Object result = method.invoke(target, args);
                        System.out.println("-----动态代理结束-----");
                        return result;
                    }
                });




    }


}
