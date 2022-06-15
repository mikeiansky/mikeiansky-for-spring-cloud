package com.winson.springcloudapp002;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author winson
 * @date 2022/6/15
 **/
@RestController
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        List<ServiceInstance> serviceInstanceList = this.discoveryClient.getInstances(applicationName);

        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(applicationName, true);
        System.out.println(instanceInfo.getHostName() + " --> "  + instanceInfo.getPort()  + " , id : " + instanceInfo.getInstanceId());

        System.out.println("client-002 find service value is : " + serviceInstanceList);
        if (serviceInstanceList != null && serviceInstanceList.size() > 0) {
            ServiceInstance serviceInstance = serviceInstanceList.get(0);
            String host = serviceInstance.getHost();
            int port = serviceInstance.getPort();
            System.out.println("service instance " + serviceInstance.getInstanceId() + " , host : " + host + " , port : " + port);
        }
        return serviceInstanceList;
    }

    @RequestMapping("/info2")
    public void info2() {
        System.out.println(" info2 method invoke ...... ");
    }

}
