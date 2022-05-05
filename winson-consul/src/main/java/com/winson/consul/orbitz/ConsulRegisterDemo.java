package com.winson.consul.orbitz;

import com.orbitz.consul.AgentClient;
import com.orbitz.consul.Consul;
import com.orbitz.consul.model.agent.ImmutableRegistration;
import com.orbitz.consul.model.health.Service;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * @author winson
 * @date 2022/5/5
 **/
public class ConsulRegisterDemo {

    public static void main(String[] args) throws InterruptedException {

        Consul consul = WinsonConsulClient.getClient();

        AgentClient client = consul.agentClient();

        String consulServiceName = "winson-consul-service-001";
        ImmutableRegistration registration1 = ImmutableRegistration.builder().address("localhost")
                .id(consulServiceName + "-001")
                .port(10001)
                .name(consulServiceName)
                .build();

        ImmutableRegistration registration2 = ImmutableRegistration.builder().address("localhost")
                .id(consulServiceName + "-002")
                .port(10002)
                .name(consulServiceName)
                .build();

        client.register(registration1);
        client.register(registration2);

        Map<String, Service> serviceMap = client.getServices();
        for (String key : serviceMap.keySet()) {
            System.out.println("key:" + key +" , value : " + serviceMap.get(key));
        }


        System.out.println("register success");
        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
        System.out.println("register app end ... ");
    }

}
