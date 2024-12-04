package io.github.mikeiansky.learn.security.service.impl;

import io.github.mikeiansky.learn.security.model.entity.User;
import io.github.mikeiansky.learn.security.mapper.UserMapper;
import io.github.mikeiansky.learn.security.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ian
 * @since 2024-12-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
