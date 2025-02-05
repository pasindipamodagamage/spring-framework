package lk.ijse;

import lk.ijse.Bean.Boy;
import lk.ijse.Config.AppConfig;
import lk.ijse.di.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: pasindi
 * Date: 1/15/25
 * Time: 10:35 AM
 * Description:
 */

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Boy boy = context.getBean(Boy.class);
//        System.out.println(boy);
//        boy.chatWithGirl();

        Test2 test2=context.getBean(Test2.class);
//        test2.display();
        context.registerShutdownHook();
    }
}
