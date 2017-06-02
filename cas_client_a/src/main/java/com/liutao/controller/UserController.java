package com.liutao.controller;

import com.liutao.entity.User;
import com.liutao.service.UserService;
import com.wordnik.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liutao on 2015/8/27.
 */
@RestController
@Api(value = "test")
@RequestMapping("/liutao")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userServiceImpl;
    @GetMapping(value = "/userInfo")
    @ResponseBody
    public User getUserInfo(@RequestParam("username") String username) {
        logger.debug("second provider");
        logger.info("username:"+username);
        User user = userServiceImpl.getUserInfo(username);
        if(user!=null){
            logger.info(user.toString());
        }
        return user;
    }
}
