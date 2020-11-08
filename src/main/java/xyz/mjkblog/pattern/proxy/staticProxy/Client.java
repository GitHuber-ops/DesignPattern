package xyz.mjkblog.pattern.proxy.staticProxy;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--4:26 PM
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacher);

        teacherDAOProxy.teach();
    }
}
