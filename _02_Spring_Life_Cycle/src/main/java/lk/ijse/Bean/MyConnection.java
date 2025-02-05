package lk.ijse.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Author: pasindi
 * Date: 1/15/25
 * Time: 1:47 PM
 * Description:
 */

public class MyConnection implements DisposableBean,BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    public MyConnection(){
        System.out.println("My Connection Object Created");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Connection Bean Name Set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection Bean Factory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection Application Context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection Object Destroyed");
    }
}
