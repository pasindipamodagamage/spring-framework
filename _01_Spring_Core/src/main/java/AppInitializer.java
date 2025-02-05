import lk.ijse.Bean.MyConnection;
import lk.ijse.Bean.SpringBean;
import lk.ijse.Bean.TestBean1;
import lk.ijse.Bean.TestBean2;
import lk.ijse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: pasindi
 * Date: 1/15/25
 * Time: 10:35 AM
 * Description:
 */

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        SpringBean bean=context.getBean(SpringBean.class);
//        System.out.println(bean);

        TestBean1 ref1=context.getBean("testBean1",TestBean1.class);
        TestBean1 ref2=context.getBean("testBean1",TestBean1.class);
        System.out.println(ref1);
        System.out.println(ref2);

        TestBean2 ref3=context.getBean("bean2",TestBean2.class);
        TestBean2 ref4=context.getBean("bean2",TestBean2.class);
        System.out.println(ref3);
        System.out.println(ref4);

        MyConnection ref5=context.getBean("myconbean",MyConnection.class);
        MyConnection ref6=context.getBean("myconbean",MyConnection.class);
        System.out.println(ref5);
        System.out.println(ref6);

        context.registerShutdownHook();

    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//        context.register(AppConfig.class);
//        context.refresh();
//
//        SpringBean bean=context.getBean(SpringBean.class);
//        System.out.println(bean);
//
//        Object bean1=context.getBean("springBean");
////        SpringBean bean1= (SpringBean) context.getBean("springBean");
//        System.out.println(bean1);
//
////        bean.testBean();
//
////        context.close();
//
////        jvm shutdown moment ekedi monahri krgnn one unam
////        Runtime.getRuntime().addShutdownHook(
////                new Thread(){
////                    @Override
////                    public void run() {
////                        System.out.println("shutting down...");
////                        context.close();
////                    }
////                }
////        );
////
//
//        TestBean1 testBean1=context.getBean(TestBean1.class);
//        System.out.println(testBean1);
//
//        TestBean1 testBean11= (TestBean1) context.getBean("testBean1");
//        System.out.println(testBean11);
//
//        TestBean1 testBean12 =context.getBean("testBean1",TestBean1.class);
//        System.out.println(testBean12);
//
////        TestBean2 testBean2=context.getBean("testBean2",TestBean2.class);
////        error shows because TestBean2 name as bean2
//
//        Object testBean2 = context.getBean("bean2");
//        System.out.println(testBean2);
//
////        MyConnection myConnectionBean=context.getBean(MyConnection.class);
//
//        MyConnection myConnectionBean=context.getBean("myconbean",MyConnection.class);
//        System.out.println(myConnectionBean);
//
//        context.registerShutdownHook();
//    }
}
