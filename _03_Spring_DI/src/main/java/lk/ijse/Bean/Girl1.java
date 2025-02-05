package lk.ijse.Bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/22/25
 * Time: 11:27 AM
 * Description:
 */
@Component
@Primary
public class Girl1 implements Agreement{
    Girl1(){
        System.out.println("Girl Constructor");
    }
    public void chat(){
        System.out.println("Girl 1 Chatting...");
    }
}
