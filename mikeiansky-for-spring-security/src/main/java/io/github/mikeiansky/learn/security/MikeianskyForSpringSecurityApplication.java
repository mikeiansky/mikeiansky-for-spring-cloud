package io.github.mikeiansky.learn.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "io.github.mikeiansky.learn.security.mapper")
@SpringBootApplication
public class MikeianskyForSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MikeianskyForSpringSecurityApplication.class, args);
    }

}
