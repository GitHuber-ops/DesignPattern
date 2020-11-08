import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--2:51 PM
 */
public class ProtoType {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Object bean1 = applicationContext.getBean("id01");
        Object bean2 = applicationContext.getBean("id01");

        System.out.println(bean1.hashCode() == bean2.hashCode());

    }
}
