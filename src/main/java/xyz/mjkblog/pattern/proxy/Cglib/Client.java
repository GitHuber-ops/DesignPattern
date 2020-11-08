package xyz.mjkblog.pattern.proxy.Cglib;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--6:11 PM
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();

        TeacherDAO proxyInstance = (TeacherDAO) new ProxyFactory(teacherDAO).getProxyInstance();

        //执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
