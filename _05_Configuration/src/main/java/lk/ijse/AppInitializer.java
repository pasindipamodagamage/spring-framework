package lk.ijse;

import lk.ijse.Config.AppConfig;
import lk.ijse.Config.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 10:46 AM
 */

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.register(AppConfig1.class);
        context.refresh();

        context.registerShutdownHook();
    }
}