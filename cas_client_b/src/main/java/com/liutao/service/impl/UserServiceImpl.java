package com.liutao.service.impl;

import com.liutao.entity.User;
import com.liutao.mapper.UserMapper;
import com.liutao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务层实现类
 *
 * @author LIUTAO
 * @version 2017/5/23
 * @see
 * @since
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfo(String username){
        User user=userMapper.findUserInfo(username);
        return user;
    }
}
