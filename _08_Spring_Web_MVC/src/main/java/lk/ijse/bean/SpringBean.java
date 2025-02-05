package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 1:56 PM
 */
@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean {
    SpringBean(){
        System.out.println("SpringBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean factory name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context");
    }
}
