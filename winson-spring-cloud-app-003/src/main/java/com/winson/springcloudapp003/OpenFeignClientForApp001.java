package com.winson.springcloudapp003;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author winson
 * @date 2022/6/15
 **/
@FeignClient("WINSON-EUREKA-CLIENT-001")
public interface OpenFeignClientForApp001 {

    @RequestMapping(method = RequestMethod.GET, value="/hello")
    void sayHello();

}
