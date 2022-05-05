package com.winson.consul.orbitz;

import com.google.common.net.HostAndPort;
import com.orbitz.consul.Consul;

/**
 * @author winson
 * @date 2022/5/5
 **/
public class WinsonConsulClient {

    public static Consul getClient(){

        HostAndPort hostAndPort = HostAndPort.fromHost("localhost").withDefaultPort(8500);
        Consul consul = Consul.builder()
                .withHostAndPort(hostAndPort)
                .build();

        return consul;

    }

}
