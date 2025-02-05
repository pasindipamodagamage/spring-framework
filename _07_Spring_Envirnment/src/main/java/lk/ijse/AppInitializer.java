package lk.ijse;

import lk.ijse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 10:46 AM
 */

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        system variables
//        Map<String, String> getenv = System.getenv();
//        for (String key: getenv.keySet()){
//            System.out.println(key+"="+getenv.get(key));
//        }

//        java properties
//        Properties properties = System.getProperties();
//        for (String key: properties.stringPropertyNames()){
//            System.out.println(key+":"+properties.getProperty(key));
//        }
//

        context.registerShutdownHook();
    }
}