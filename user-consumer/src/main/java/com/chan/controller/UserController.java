package com.chan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chan.model.vo.UserVo;
import com.chan.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Chan
 * @Date: 2019/8/28 21:15
 * @Description:
 */
@RestController
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public UserVo hello() {
        return userService.hello();
    }

}
