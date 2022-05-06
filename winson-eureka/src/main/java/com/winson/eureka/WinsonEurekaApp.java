package com.winson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @author winson
 * @date 2022/5/6
 **/
@SpringBootApplication
@EnableEurekaServer
public class WinsonEurekaApp {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(WinsonEurekaApp.class, args);
        System.out.println(context);

//        CountDownLatch latch = new CountDownLatch(1);
//        latch.await();

    }

}
