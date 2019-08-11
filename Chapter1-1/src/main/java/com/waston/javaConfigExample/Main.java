package com.waston.javaConfigExample;

import com.waston.javaConfigExample.config.MainConfig;
import com.waston.javaConfigExample.pojo.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //加载注解配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        //获取Java配置文件中bean的name
        Work work = (Work)context.getBean("work");
        work.showProfession();
    }
}