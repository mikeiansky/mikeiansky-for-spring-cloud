package com.winson.winsonspringcloudappz;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author winson
 * @date 2022/6/15
 **/
@RestController
@EnableFeignClients
public class WinsonSpringCloudAppControllerZ {

    @Autowired
    private OpenFeignClientForAppZ openFeignClientForAppZ;

    private AtomicInteger index = new AtomicInteger();

    @GetMapping("/delegate/hello")
    public String delegateHello() {
        int id = index.getAndIncrement();
        System.out.println("app - z - delegate hello start id : " + id);
        String result = openFeignClientForAppZ.sayHello();
        System.out.println("app - z - delegate hello complete id : " + id + " , result : " + result);
        return result;
    }

}
