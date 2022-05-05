package com.winson.consul.orbitz;

import com.orbitz.consul.CatalogClient;
import com.orbitz.consul.Consul;
import com.orbitz.consul.model.ConsulResponse;

import java.util.List;
import java.util.Map;

/**
 * @author winson
 * @date 2022/5/5
 **/
public class ConsulCatalogDemo {

    public static void main(String[] args) {

        Consul consul = WinsonConsulClient.getClient();
        CatalogClient catalogClient = consul.catalogClient();
        ConsulResponse<Map<String, List<String>>> response = catalogClient.getServices();
        Map<String, List<String>> list = response.getResponse();
        System.out.println("list.size():"+list.size());
        for (String key : list.keySet()) {
            System.out.println("key : " + key + " , value : " + list.get(key));
        }


        System.out.println("consul client end ... ");

    }

}
