package lk.ijse.Bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 10:48 AM
 */

@Component
public class SpringBean implements InitializingBean {
    @Value("pasindi")
    String name;
    public SpringBean(){
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
