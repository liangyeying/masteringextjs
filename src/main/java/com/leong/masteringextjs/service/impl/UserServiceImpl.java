package com.leong.masteringextjs.service.impl;

import com.leong.masteringextjs.entity.User;
import com.leong.masteringextjs.repository.UserRepo;
import com.leong.masteringextjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leongfeng created on 2018-07-28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userRepo.findByUsernameAndPassword(username, password);
    }
}
