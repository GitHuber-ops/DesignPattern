package xyz.mjkblog.principle.segregation;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--9:55 AM
 */
public class Segregation1 {
}


interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

//A类依赖Interface中的123三个方法
class A {
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }

    public void depend2(Interface1 interface1){
        interface1.operation2();
    }

    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}


//C类依赖Interface中的145三个方法
class C {
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }

    public void depend4(Interface1 interface1){
        interface1.operation4();
    }

    public void depend5(Interface1 interface1){
        interface1.operation5();
    }
}

class B implements Interface1{

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

    @Override
    public void operation4() {
        System.out.println("B implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B implements operation5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D implements operation3");
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