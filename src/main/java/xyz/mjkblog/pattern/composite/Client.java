package xyz.mjkblog.pattern.composite;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--9:16 PM
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("Tingshua", "Nb de university...");

        College college = new College("CS", "CS");
        College college1 = new College("SE", "SE");

        college.add(new Department("YYYY","YYYY"));
        college.add(new Department("WWWW","WWWW"));

        university.add(college);
        university.add(college1);
    }
}
