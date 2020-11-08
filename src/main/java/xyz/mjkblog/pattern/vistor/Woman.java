package xyz.mjkblog.pattern.vistor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--6:19 PM
 */

//这里使用到了双分派，即首先在客户端程序中，将具体的状态作为参数传递到Women（第一次分派）
//然后在Woman类，调用了作为具体参数的“具体方法”中的getWomenConclusion()，同时将自己(this)作为参数传入，完成第二次分派
public class Woman extends Person {
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}
