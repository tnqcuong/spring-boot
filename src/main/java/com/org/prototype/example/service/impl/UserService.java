//package com.org.prototype.example.service.impl;
//
//
//import com.org.prototype.example.dao.UserDao;
//import com.org.prototype.example.dto.UserDto;
//import com.org.prototype.example.model.User;
//import com.org.prototype.example.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserService implements IUserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public User registerNewUserAccount(UserDto accountDto) {
//        final User user = new User();
//
//        user.setEmail(accountDto.getEmail());
//        user.setName(accountDto.getName());
//        user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
//        return userDao.save(user);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException {
//        return null;
//    }
//
//}
