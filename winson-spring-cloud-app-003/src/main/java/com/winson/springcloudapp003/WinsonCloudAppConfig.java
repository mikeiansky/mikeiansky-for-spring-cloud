package com.winson.springcloudapp003;

import io.github.resilience4j.common.circuitbreaker.configuration.CircuitBreakerConfigCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author winson
 * @date 2022/6/16
 **/
@Configuration
public class WinsonCloudAppConfig {

    @Bean
    public CircuitBreakerConfigCustomizer firstCircuitBreakerConfigCustomizer(){
        return CircuitBreakerConfigCustomizer.of("winson",
                builder ->
                        builder.slidingWindowSize(2)


        );
    }

}
