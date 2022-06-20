package com.ciwei.winsonforwebflux;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @author winson
 * @date 2022/6/17
 **/
@RestController
public class WinsonWebFluxController {

    @GetMapping("hello")
    public Mono<String> helloWorld(){
        System.out.println("hello world ...... " );

//        return "hello webflux";

        return Mono.just("hello webflux 002").delayElement(Duration.ofSeconds(1));
    }

}
