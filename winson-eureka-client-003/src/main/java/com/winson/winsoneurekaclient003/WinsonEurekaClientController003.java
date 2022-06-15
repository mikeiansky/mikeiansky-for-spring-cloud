package com.winson.winsoneurekaclient003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author winson
 * @date 2022/6/15
 **/
@RestController
@EnableFeignClients
public class WinsonEurekaClientController003 {

    @Autowired
    private OpenFeignClient003 openFeignClient003;

    @GetMapping("/thrid/hello")
    public void delegateHello(){
        System.out.println("openFeignClient003 : " + openFeignClient003);
        openFeignClient003.sayHello();
        System.out.println(" delegate third hello invoke ... ");
    }

}
