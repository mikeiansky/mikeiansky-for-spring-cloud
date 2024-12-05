package io.github.mikeiansky.spring.security.base;

import io.github.mikeiansky.spring.security.base.config.BaseSpringSecurityConfig;
import io.github.mikeiansky.spring.security.base.service.HelloMessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class WithMockUserTests {

    @Autowired
    private HelloMessageService messageService;

    @Test
    @WithMockUser(username = "admin" , authorities = {"USER"})
    public void getMessageUnauthenticated() {
        String result = messageService.getMessage();
        System.out.println(result);
    }

}
