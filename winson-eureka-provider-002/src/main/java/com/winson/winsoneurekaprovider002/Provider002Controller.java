package com.winson.winsoneurekaprovider002;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author winson
 * @date 2022/6/15
 **/
@Controller
public class Provider002Controller {

    @RequestMapping("/provider/second/msg")
    public void providerService(){
        System.out.println(" provider service two invoke ...... ");
    }

}
