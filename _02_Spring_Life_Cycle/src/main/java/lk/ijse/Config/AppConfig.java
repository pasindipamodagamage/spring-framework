package lk.ijse.Config;

import lk.ijse.Bean.MyConnection;
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
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    MyConnection myConnection(){
        return new MyConnection();
    }
}
