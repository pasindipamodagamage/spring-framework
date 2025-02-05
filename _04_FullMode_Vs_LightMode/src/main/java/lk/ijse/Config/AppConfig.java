package lk.ijse.Config;

import lk.ijse.Bean.SpringBeanOne;
import lk.ijse.Bean.SpringBeanTwo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Author: pasindi
 * Date: 1/15/25
 * Time: 10:36 AM
 * Description:
 */

@Configuration
@ComponentScan(basePackages = "lk.ijse.Bean")
public class AppConfig {

//    inter bean dependancy
//    @Bean
//    public SpringBeanOne getSpringBeanOne(){
//        SpringBeanTwo springBeanTwo1=new SpringBeanTwo();
//        SpringBeanTwo springBeanTwo2=new SpringBeanTwo();
//        return new SpringBeanOne();
//    }
//
//    @Bean
//    public SpringBeanTwo getSpringBeanTwo(){
//        return new SpringBeanTwo();
//    }


}
