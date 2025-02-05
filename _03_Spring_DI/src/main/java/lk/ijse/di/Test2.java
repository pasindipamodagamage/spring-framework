package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/22/25
 * Time: 12:04 PM
 * Description:
 */
@Component
public class Test2 implements DIInterface {
    @Autowired
    DI test1;

    public Test2(Test1 test1){
        this.test1 = test1;
    }
//
//    public void display(){
//        test1.sayHello();
//    }
}
