package lk.ijse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Author: Pasindi
 * Date: 2025-02-05
 * Time: 10:55 AM
*/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
