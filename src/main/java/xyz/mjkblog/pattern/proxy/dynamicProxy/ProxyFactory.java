package xyz.mjkblog.pattern.proxy.dynamicProxy;

import lombok.AllArgsConstructor;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--4:53 PM
 */
@AllArgsConstructor
public class ProxyFactory {
    private Object target;

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader()
                , target.getClass().getInterfaces()
                , new InvocationHandler() {
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        return method.invoke(o, objects);
                    }
                });
    }
}
