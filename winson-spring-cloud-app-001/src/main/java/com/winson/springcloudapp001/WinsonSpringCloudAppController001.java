package com.winson.springcloudapp001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author winson
 * @date 2022/6/15
 **/
@RestController
public class WinsonSpringCloudAppController001 {

    private AtomicInteger index = new AtomicInteger();

    @GetMapping("/hello")
    public void sayHello(){
        int id = index.incrementAndGet();
        System.out.println("v1 hello invoke start ... " + id);
//        CountDownLatch latch = new CountDownLatch(1);
//        try {
//            latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("v1 hello invoke complete ... " + id);
    }

}
