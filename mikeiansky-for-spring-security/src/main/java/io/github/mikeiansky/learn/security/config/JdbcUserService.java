package io.github.mikeiansky.learn.security.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@Slf4j
public class JdbcUserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("load user by name : {}", username);
//        User user = new User(username, "123456", List.of(new SimpleGrantedAuthority("USER")));
        User user = new User(username, "{noop}123456",
                List.of(new SimpleGrantedAuthority("ROLE_USER")));
        return user;
    }

}
