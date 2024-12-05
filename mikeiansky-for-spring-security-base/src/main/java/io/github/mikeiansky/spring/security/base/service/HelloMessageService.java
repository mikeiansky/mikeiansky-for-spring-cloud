package io.github.mikeiansky.spring.security.base.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * @author mike ian
 * @date 2024/12/5
 * @desc
 **/
@Service
public class HelloMessageService {

//    @PreAuthorize("authenticated")
    @PreAuthorize("hasAuthority('USER')")
    public String getMessage() {
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();
        return "Hello " + authentication;
    }

}
