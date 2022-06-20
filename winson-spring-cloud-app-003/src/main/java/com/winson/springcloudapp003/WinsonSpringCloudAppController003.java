package com.winson.springcloudapp003;

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
public class WinsonSpringCloudAppController003 {

    @Autowired
    private OpenFeignClientForApp001 openFeignClientForApp001;

    private AtomicInteger index = new AtomicInteger();

    @GetMapping("/thrid/hello")
    public void delegateHello(){
        System.out.println("openFeignClient003 : " + openFeignClientForApp001);
        openFeignClientForApp001.sayHello();
        System.out.println(" delegate third hello invoke ... ");
    }

    @CircuitBreaker(name = "winson")
    @Bulkhead(name = "winson")
    @GetMapping("/test/breaker")
    public void testCircuitBreaker(){
        int id = index.incrementAndGet();
        System.out.println("test circuit breaker start ... " + id);
        CountDownLatch latch = new CountDownLatch(1);
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test circuit breaker complete ... " + id);
    }

}
