package lk.ijse.Config;

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
@ComponentScan(basePackages = "lk.ijse.di")
public class AppConfig {

}
