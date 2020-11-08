package xyz.mjkblog.pattern.proxy.Cglib;


import lombok.AllArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--6:00 PM
 */
@AllArgsConstructor
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib on...");
        Object invoke = method.invoke(target, objects);
        return invoke;
    }
}
