package com.org.prototype.example.service;

import com.org.prototype.example.dto.UserDto;
import com.org.prototype.example.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IUserService {
    User registerNewUserAccount(UserDto accountDto);

    UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException;
}
