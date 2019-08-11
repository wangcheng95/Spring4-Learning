package com.waston.xml;

import com.waston.xml.pojo.User;
import com.waston.xml.pojo.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        User user1 = (User) context.getBean("user1");
        System.out.println(user1.toString());

        User user2 = (User) context.getBean("user2");
        System.out.println(user2.toString());

        Work worker1 = (Work) context.getBean("worker1");
        worker1.work();

        Work worker2 = (Work) context.getBean("worker2");
        worker2.work();
    }
}
