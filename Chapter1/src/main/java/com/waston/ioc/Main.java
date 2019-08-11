package com.waston.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //从类路径 ClassPath 的一个或多个 XML 文件加载上下文定义
        //IDEA打成jar包，会将resources的beans.xml放在类路径下，可以打包解压看看。
        //如果要指定其他位置加载XML，可以使用FileSystemXmlApplicationContext。
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Work work = (Work) context.getBean("work");
        work.showProfession();
    }
}
