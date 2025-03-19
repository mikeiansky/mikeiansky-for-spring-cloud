package io.github.mikeiansky.spring.security.base;

import io.github.mikeiansky.spring.security.base.service.HelloMessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@SpringBootApplication
public class SpringSecurityBaseApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringSecurityBaseApp.class, args);
//        HelloMessageService helloMessageService = applicationContext.getBean(HelloMessageService.class);
//        String result = helloMessageService.getMessage();
//        System.out.println("hello message: " + result);
    }

}
