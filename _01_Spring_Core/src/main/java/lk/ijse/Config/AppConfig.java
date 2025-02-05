package lk.ijse.Config;

import lk.ijse.Bean.MyConnection;
import lk.ijse.Bean.SpringBean;
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
//package
@ComponentScan(basePackages = "lk.ijse.Bean")

//multipule packages
//@ComponentScan(basePackages = {"lk.ijse.Bean","lk.ijse.dto"})

//unique class
//@ComponentScan(basePackageClasses = SpringBean.class)
public class AppConfig {
    @Bean("myconbean")
    @Scope("prototype")
    MyConnection myConnection(){
        return new MyConnection();
    }
}
