package com.liutao.dao;

import com.liutao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户Jpa持久层
 *
 * @author LIUTAO
 * @version 2017/5/23
 * @see
 * @since
 */
public interface UserDao extends JpaRepository<User, Integer> {
    User findUserByName(String name);
}
