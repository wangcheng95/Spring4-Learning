package com.waston.autowired.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration 注解表明这是个配置类，@ComponentScan 注解会启动组件扫描，默认会扫描与该类相同的包,
// Spring 将会扫描该包及子包所有带有 @Component 的类，自动为其创建一个 bean。
@Configuration
@ComponentScan("com.waston.autowired.pojo")
public class MainConfig {
    //@ComponentScan还可以使用以下用法：
    //1. @ComponentScan("com.waston.xxx")
    //2. @ComponentScan(basePackages="com.waston.xxx")
    //3. @ComponentScan(basePackages={"com.waston.xxx","com.yyy.xxx"})
    //4. @ComponentScan(basePackageClasses={"XXXService.class","YYYService.class"})
}