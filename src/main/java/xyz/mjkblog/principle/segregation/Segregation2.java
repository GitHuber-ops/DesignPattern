package xyz.mjkblog.principle.segregation;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--10:35 AM
 */
public class Segregation2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        //a通过接口去依赖b
        a2.depend1(new B2());
        a2.depend2(new B2());
        a2.depend3(new B2());
    }
}


interface Interface2_1{
    void operation1();
}
interface Interface2_2{
    void operation2();
    void operation3();
}
interface Interface2_3{
    void operation4();
    void operation5();
}

//A类依赖Interface中的123三个方法
class A2 {
    public void depend1(Interface2_1 interface1){
        interface1.operation1();
    }

    public void depend2(Interface2_2 interface2){
        interface2.operation2();
    }

    public void depend3(Interface2_2 interface2){
        interface2.operation3();
    }
}


//C类依赖Interface中的145三个方法
class C2 {
    public void depend1(Interface2_1 interface1){
        interface1.operation1();
    }

    public void depend4(Interface2_3 interface3){
        interface3.operation4();
    }

    public void depend5(Interface2_3 interface3){
        interface3.operation5();
    }
}

class B2 implements Interface2_1, Interface2_2{

    @Override
    public void operation1() {
        System.out.println("B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation3");
    }
}

class D2 implements Interface2_1, Interface2_3{

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D implements operation5");
    }
}
