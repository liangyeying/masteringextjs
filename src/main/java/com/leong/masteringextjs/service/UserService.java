package com.leong.masteringextjs.service;

import com.leong.masteringextjs.entity.User;

/**
 * @author leongfeng created on 2018-07-28.
 */
public interface UserService {

    User findByUsernameAndPassword(String username, String password);
}
