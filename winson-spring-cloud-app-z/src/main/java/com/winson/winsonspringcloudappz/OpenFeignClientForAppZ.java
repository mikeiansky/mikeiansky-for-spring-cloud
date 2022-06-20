package com.winson.winsonspringcloudappz;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author winson
 * @date 2022/6/15
 **/
@FeignClient("winson-cloud-app-001")
public interface OpenFeignClientForAppZ {

    @LoadBalanced
    @RequestMapping(method = RequestMethod.GET, value="/hello")
    String sayHello();

}
