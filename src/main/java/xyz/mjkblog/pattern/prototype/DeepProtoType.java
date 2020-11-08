package xyz.mjkblog.pattern.prototype;

import java.io.*;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--3:50 PM
 */
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneTarget deepCloneTarget;

    //方式一
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        deep = super.clone();
        //对引用类型属性进行单独处理
        DeepCloneTarget deepCloneTarget = (DeepCloneTarget) deep;
        Object clone = deepCloneTarget.clone();
        return deep;
    }

    //通过序列化实现深拷贝
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream byteArrayOutputSteam = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            byteArrayOutputSteam = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputSteam);
            objectOutputStream.writeObject(this);

            byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputSteam.toByteArray());
            objectInputStream=new ObjectInputStream(byteArrayInputStream);
            DeepProtoType deepProtoType = (DeepProtoType) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
                byteArrayInputStream.close();
                objectOutputStream.close();
                byteArrayOutputSteam.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return deepCloneTarget;
    }
}
