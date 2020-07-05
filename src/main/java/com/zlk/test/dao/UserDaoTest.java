package com.zlk.test.dao;

import com.zlk.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
public class UserDaoTest {


    public static void main(String[] args) {
        //方式1 xml： 获取spring bean
        /* <!--<bean id="userDao" class="com.zlk.dao.UserDao"></bean>-->*/

        //方式2 @Bean： 获取spring bean
         /* (1) dao纳入spring 管理，加注解如@Component
            (2)配置类
            @ComponentScan("com.zlk.dao")
            @Configuration
            public class AppConfig {
                private final String  APP_CONTEXT = "applicationContext.xml";

                @Bean
                public UserDao getUserDao(){
                    return new UserDao();
                }

            }
            (3)applicationContext.xml
            <!--@Configuration配置中需要扫描加入spring容器的包路径-->
            <context:component-scan base-package="com.zlk.dao" />*/

        // 方式3

         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         System.out.println(context.getBean("userDao"));


    }
}
