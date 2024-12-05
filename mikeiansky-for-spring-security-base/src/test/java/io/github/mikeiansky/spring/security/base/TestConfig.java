package io.github.mikeiansky.spring.security.base;

import io.github.mikeiansky.spring.security.base.service.HelloMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@Configuration
public class TestConfig {

    @Bean
    public HelloMessageService helloMessageService(){
        return new HelloMessageService();
    }

}
