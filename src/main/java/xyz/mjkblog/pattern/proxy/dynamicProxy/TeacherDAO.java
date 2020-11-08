package xyz.mjkblog.pattern.proxy.dynamicProxy;

import xyz.mjkblog.pattern.proxy.staticProxy.ITeacherDao;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--4:52 PM
 */
public class TeacherDAO implements ITeacherDao {

    public void teach() {
        System.out.println("Teacher is teaching...");
    }
}
