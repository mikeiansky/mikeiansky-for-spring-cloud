package io.github.mikeiansky.learn.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mike ian
 * @date 2024/12/4
 * @desc
 **/
@RequestMapping("test")
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(@RequestParam(name = "msg") String msg) {
        return "hello [ " + msg + " ]";
    }

}
