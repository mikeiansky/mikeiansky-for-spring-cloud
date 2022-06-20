package com.winson.springcloudapp003;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
class WinsonSpringCloudApp003Tests {

    @Test
    void contextLoads() throws MalformedURLException, InterruptedException {
        String path = "http://windows10.microdone.cn:9003/test/breaker";
        int size = 10;
        Thread[] ts = new Thread[size];

        for (int i = 0; i < size; i++) {
            int finalI = i;
            ts[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForEntity("http://windows10.microdone.cn:9003/test/breaker", String.class);
//                    String path = "http://windows10.microdone.cn:9003/thrid/hello";
//                    URL url = new URL(path);
                    ResponseEntity<String> result = restTemplate.getForEntity(path, String.class);
                    System.out.println(finalI + "request result : " + result);
                }
            });
            ts[i].start();
        }

        for (int i = 0; i < size; i++) {
            ts[i].join();
        }


        System.out.println("test complete ... ");
    }

}
