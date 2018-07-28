package com.leong.masteringextjs.web;

import com.leong.masteringextjs.core.ControllerRuntimeException;
import com.leong.masteringextjs.result.ResultEntity;
import com.leong.masteringextjs.result.ResultResponse;
import com.leong.masteringextjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leongfeng created on 2018-07-27.
 */
@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultEntity<?> login(String user, String password) {
        if (userService.findByUsernameAndPassword(user, password) == null) {
          return ResultResponse.failure(new ControllerRuntimeException("登录失败，用户名或者密码错误"));
        }

        return ResultResponse.success();
    }
}
