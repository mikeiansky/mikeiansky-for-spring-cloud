package com.winson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author winson
 * @date 2022/5/6
 **/
@SpringBootApplication
@EnableEurekaServer
public class WinsonEurekaServerApp {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(WinsonEurekaServerApp.class, args);
        System.out.println(context);

//        CountDownLatch latch = new CountDownLatch(1);
//        latch.await();

    }

}
