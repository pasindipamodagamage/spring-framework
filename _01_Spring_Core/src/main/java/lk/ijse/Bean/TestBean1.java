package lk.ijse.Bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/15/25
 * Time: 10:55 AM
 * Description:
 */

@Component
@Scope("prototype")
public class TestBean1 {
    public TestBean1(){
        System.out.println("TestBean1 Constructor");
    }
}
