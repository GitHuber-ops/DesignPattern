package xyz.mjkblog.principle.dependencyInversioin;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--1:25 PM
 */

//修改1中的代码，增加了一个IReceiver，表示接收者接口，email，wechat均属于IReceiver
//Person仅需要与IReceiver建立连接即可
public class DependencyInversion2 {
    public static void main(String[] args) {
        new Person2().receive(new Email2());
        new Person2().receive(new WeChat());
    }
}

interface IReceiver{
    String getInfo();
}

class Email2 implements IReceiver{

    @Override
    public String getInfo() {
        return "Email: hello...";
    }
}

class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "WeChat: hello...";
    }
}

class Person2{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
