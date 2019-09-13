package com.org.prototype.example.service;

import com.org.prototype.example.dto.UserDto;
import com.org.prototype.example.model.User;

public interface IUserService {
    User registerNewUserAccount(UserDto accountDto);
}
