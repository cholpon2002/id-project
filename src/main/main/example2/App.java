package example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Auditing hello = context.getBean("sayHello", Auditing.class);
        System.out.println(hello.get());
        context.close();
    }
}
