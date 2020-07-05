package com.zlk.config;

import com.zlk.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan("com.zlk.dao")
@Configuration
public class AppConfig {
    private final String  APP_CONTEXT = "applicationContext.xml";

    @Bean
    public ApplicationContext getApplication(){
        //初始化Spring容器ApplicationContext，加载配置文件
       return new ClassPathXmlApplicationContext(APP_CONTEXT);
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }

}
