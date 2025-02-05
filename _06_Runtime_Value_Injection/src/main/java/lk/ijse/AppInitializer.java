package lk.ijse;

import lk.ijse.Config.AppConfig;
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
        context.refresh();

        context.registerShutdownHook();
    }
}