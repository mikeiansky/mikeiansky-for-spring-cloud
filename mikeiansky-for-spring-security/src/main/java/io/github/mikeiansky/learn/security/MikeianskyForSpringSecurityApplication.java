package io.github.mikeiansky.learn.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class MikeianskyForSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MikeianskyForSpringSecurityApplication.class, args);
    }

}
