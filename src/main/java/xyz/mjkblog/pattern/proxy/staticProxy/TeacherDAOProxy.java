package xyz.mjkblog.pattern.proxy.staticProxy;

import lombok.AllArgsConstructor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--4:18 PM
 */
@AllArgsConstructor
public class TeacherDAOProxy implements ITeacherDao {
    private ITeacherDao iTeacherDao;

    public void teach() {
        iTeacherDao.teach();
    }
}
