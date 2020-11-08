package xyz.mjkblog.pattern.proxy.dynamicProxy;

import java.util.Properties;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--5:08 PM
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();

        ProxyFactory proxyFactory = new ProxyFactory(teacherDAO);
        Object proxyInstance = proxyFactory.getProxyInstance();

        System.out.println("proxyInstance = " + proxyInstance);
    }
}
