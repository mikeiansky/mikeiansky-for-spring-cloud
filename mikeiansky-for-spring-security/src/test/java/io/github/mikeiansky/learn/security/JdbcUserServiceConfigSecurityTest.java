package io.github.mikeiansky.learn.security;

import com.alibaba.fastjson2.JSON;
import io.github.mikeiansky.learn.security.model.vo.UserVO;
import io.github.mikeiansky.learn.security.service.UserMethodSecurityService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class JdbcUserServiceConfigSecurityTest {

    @Autowired
    private UserMethodSecurityService userMethodSecurityService;

    @Test
//    @WithMockUser(username = "user")
    public void getMessageWithMockUserCustomUsername() {
//        UserVO userVO = userMethodSecurityService.getUserInfo(1);
//        log.info("use info : {}", JSON.toJSONString(userVO));
        System.out.println("Test");
    }

}
