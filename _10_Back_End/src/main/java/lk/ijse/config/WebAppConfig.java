package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author: Pasindi
 * Date: 2025-02-05
 * Time: 10:55 AM
*/

@Configuration
@ComponentScan("lk.ijse.controller")
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("api/v1/customer/**")
//                .allowedOrigins("*")
//                .allowedMethods("GET","POST","PUT","DELETE","OPTION")
//                .allowCredentials(true)
//                .allowedHeaders("*");
//    }
}
