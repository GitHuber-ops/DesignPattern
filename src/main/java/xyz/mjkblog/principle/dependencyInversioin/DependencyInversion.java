package xyz.mjkblog.principle.dependencyInversioin;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--1:21 PM
 */
public class DependencyInversion {
    public static void main(String[] args) {

    }
}

class Email{
    public String getInfo(){
        return "Email: get info...";
    }
}

//receive直接依赖于Email类
//若要接受其他消息则只能增加新类和新方法
class Person{
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
