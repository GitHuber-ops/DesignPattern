package xyz.mjkblog.pattern.proxy.staticProxy;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--4:17 PM
 */
public class Teacher implements ITeacherDao {
    public void teach() {
        System.out.println("Teacher is teaching...");
    }
}
