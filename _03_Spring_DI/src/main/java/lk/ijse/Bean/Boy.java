package lk.ijse.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/22/25
 * Time: 11:28 AM
 * Description:
 */
@Component
public class Boy {
    @Qualifier("girl1")
   @Autowired
   Agreement girl;

   Boy(){
       System.out.println("Boy Constructor");
   }
    public void chatWithGirl(){
        girl.chat();
    }
}
