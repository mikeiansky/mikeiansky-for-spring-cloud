package com.winson.winsoneurekaprovider002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author winson
 * @date 2022/6/15
 **/
@Controller
public class EurekaClientController002 {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        List<ServiceInstance> instanceList = this.discoveryClient.getInstances(applicationName);
        System.out.println(" serviceInstancesByApplicationName applicationName : " + applicationName + " , instanceList : " + instanceList);
        return instanceList;
    }

    @RequestMapping("/provider/second/msg")
    public void providerService() {
        System.out.println(" provider service two invoke ...... ");
    }

}
