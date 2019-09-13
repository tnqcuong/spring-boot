package com.org.prototype.example.dao;

import com.org.prototype.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}
