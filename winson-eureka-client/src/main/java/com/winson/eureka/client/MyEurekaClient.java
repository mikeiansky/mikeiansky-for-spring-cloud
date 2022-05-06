package com.winson.eureka.client;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author winson
 * @date 2022/5/6
 **/
@Service
public class MyEurekaClient implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet ====> ");
    }

}
