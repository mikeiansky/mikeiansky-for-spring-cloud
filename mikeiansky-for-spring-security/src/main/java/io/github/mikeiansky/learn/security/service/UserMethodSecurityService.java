package io.github.mikeiansky.learn.security.service;

import io.github.mikeiansky.learn.security.model.entity.User;
import io.github.mikeiansky.learn.security.model.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@Slf4j
@Service
public class UserMethodSecurityService {

    private final IUserService userService;

    public UserMethodSecurityService(IUserService userService) {
        this.userService = userService;
    }

    @PreAuthorize("hasRole('USER')")
    public UserVO getUserInfo(int id) {
        log.info("get user info id : {}", id);
        User user = userService.getById(id);
        log.info("get user info result user : {}", user);
        if (user == null) return null;
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

}
