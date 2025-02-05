package lk.ijse.Bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/22/25
 * Time: 11:51 AM
 * Description:
 */
@Component
@Primary
public class Girl2 implements Agreement{
    Girl2(){
        System.out.println("Girl Constructor");
    }
    public void chat(){
        System.out.println("Girl 2 Chatting...");
    }
}
