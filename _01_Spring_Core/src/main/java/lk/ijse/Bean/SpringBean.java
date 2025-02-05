package lk.ijse.Bean;

import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/15/25
 * Time: 10:36 AM
 * Description:
 */
@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Object Created");
    }

    public void testBean(){
        System.out.println("testBean is execute");
    }
}
