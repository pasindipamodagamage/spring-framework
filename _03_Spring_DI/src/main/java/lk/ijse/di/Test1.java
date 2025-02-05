package lk.ijse.di;

import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/22/25
 * Time: 12:04 PM
 * Description:
 */
@Component
public class Test1 implements DI{
    Test1(){
        System.out.println("Test 1 Constructor");
    }
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
