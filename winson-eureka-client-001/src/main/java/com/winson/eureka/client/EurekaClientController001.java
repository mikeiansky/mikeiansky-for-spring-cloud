package com.winson.eureka.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author winson
 * @date 2022/6/15
 **/
@Controller
public class EurekaClientController001 {

    @RequestMapping("/provider/hello")
    public void sayHello(){
        System.out.println(" say hello controller invoke ...... ");
    }

}
