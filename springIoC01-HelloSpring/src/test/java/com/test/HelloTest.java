package com.test;

import com.Pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        //比较原始的办法，以后用注解
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了，我们要使用直接拿出来就可以

        //name：是beans里面的id
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
