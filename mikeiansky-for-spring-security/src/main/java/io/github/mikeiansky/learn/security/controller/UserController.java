package io.github.mikeiansky.learn.security.controller;

import io.github.mikeiansky.learn.security.model.entity.User;
import io.github.mikeiansky.learn.security.model.vo.UserVO;
import io.github.mikeiansky.learn.security.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author ian
 * @since 2024-12-04
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("info")
    public UserVO getUserInfo(@RequestParam(name = "id") int id) {
        log.info("get user info id : {}", id);
        User user = userService.getById(id);
        log.info("get user info result user : {}", user);
        if (user == null) return null;

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

}
