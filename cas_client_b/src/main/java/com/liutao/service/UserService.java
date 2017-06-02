package com.liutao.service;

import com.liutao.entity.User;

/**
 * 用户服务层接口
 *
 * @author LIUTAO
 * @version 2017/5/23
 * @see
 * @since
 */
public interface UserService {

    User getUserInfo(String username);

}
