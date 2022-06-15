package com.winson.springcloudapp003;

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
public class WinsonSpringCloudAppController003 {

    @Autowired
    private OpenFeignClientForApp001 openFeignClientForApp001;

    @GetMapping("/thrid/hello")
    public void delegateHello(){
        System.out.println("openFeignClient003 : " + openFeignClientForApp001);
        openFeignClientForApp001.sayHello();
        System.out.println(" delegate third hello invoke ... ");
    }

}
