package com.winson.consul.orbitz;

import com.orbitz.consul.*;
import com.orbitz.consul.cache.ConsulCache;
import com.orbitz.consul.cache.ServiceHealthCache;
import com.orbitz.consul.cache.ServiceHealthKey;
import com.orbitz.consul.model.health.Service;
import com.orbitz.consul.model.health.ServiceHealth;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * @author winson
 * @date 2022/5/6
 **/
public class ConsulListenerDemoV1 {

    public static void main(String[] args) throws InterruptedException {

        Consul consul = WinsonConsulClient.getClient();

        AgentClient agentClient = consul.agentClient();
        Map<String, Service> serviceMap = agentClient.getServices();
        System.out.println(serviceMap);

        HealthClient healthClient = consul.healthClient();

        ServiceHealthCache cache = ServiceHealthCache.newCache(healthClient, "winson-consul-service-001");
        cache.addListener(new ConsulCache.Listener<ServiceHealthKey, ServiceHealth>() {
            @Override
            public void notify(Map<ServiceHealthKey, ServiceHealth> newValues) {
                System.out.println("newValues : " + newValues);
                for (ServiceHealthKey serviceHealthKey : newValues.keySet()) {
                    ServiceHealth serviceHealth = newValues.get(serviceHealthKey);
                    System.out.println(serviceHealth.getService());
                }
            }
        });
        cache.start();
        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
