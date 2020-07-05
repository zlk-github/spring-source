package com.zlk.vo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 *
 * 注：（BeanFactory是Spring 的一个大工厂
 * FactoryBean是spring的一个小工厂，是一个bean）
 *
 * BeanFactoryPostProcessor 是工厂后者处理器
 */
public class UserBean  implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.getBeanDefinition("");
    }
}
