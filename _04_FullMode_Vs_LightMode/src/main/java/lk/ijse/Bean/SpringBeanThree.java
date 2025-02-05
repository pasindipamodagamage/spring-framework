package lk.ijse.Bean;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 10:19 AM
 */

public class SpringBeanThree implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanThree.setBeanName" + name);
    }
}
