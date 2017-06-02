package com.liutao.mapper;


import com.liutao.entity.User;

/**
 * 用户Mapper持久层
 *
 * @author LIUTAO
 * @version 2017/5/23
 * @see
 * @since
 */
public interface UserMapper {
    public User findUserInfo(String username);
}
