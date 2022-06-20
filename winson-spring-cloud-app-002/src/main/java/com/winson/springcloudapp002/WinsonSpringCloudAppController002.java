package com.winson.springcloudapp002;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author winson
 * @date 2022/6/15
 **/
@RestController
public class WinsonSpringCloudAppController002 {

    private AtomicInteger index = new AtomicInteger();

    @GetMapping("/hello")
    public String sayHello(){
        int id = index.incrementAndGet();
        System.out.println("app 002 hello invoke start ... " + id);
//        CountDownLatch latch = new CountDownLatch(1);
//        try {
//            latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("app 002 hello invoke complete ... " + id);
        return "app-002";
    }

}
