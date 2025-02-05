package lk.ijse.Config;

import lk.ijse.Bean.SpringBean;
import lk.ijse.Bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 10:48 AM
 */
@Configuration
public class AppConfig2 {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}

