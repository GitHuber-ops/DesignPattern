package xyz.mjkblog.principle.liskov;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--2:28 PM
 */
public class Liskov2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("-------------------lalala---------------------");
        B2 b = new B2();
        System.out.println("11 - 3 = " + b.func1(11, 3));
        System.out.println("1 - 8 = " + b.func1(1, 8));
    }
}

class Base {

}

class A2 extends Base{
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B2 extends Base {
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }
}

