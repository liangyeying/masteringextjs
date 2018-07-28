package com.leong.masteringextjs.repository;

import com.leong.masteringextjs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author leongfeng created on 2018-07-27.
 */
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);
}
