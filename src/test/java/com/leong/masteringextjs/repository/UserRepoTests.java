package com.leong.masteringextjs.repository;

import com.leong.masteringextjs.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * @author leongfeng created on 2018-07-27.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepoTests {

    @Autowired
    UserRepo userRepo;

    @Test
    public void testFindByUsernameAndPassword() {
        User user = userRepo.findByUsernameAndPassword("mike", "111111");
        Assert.notNull(user);
        System.out.println(user);
    }
}
