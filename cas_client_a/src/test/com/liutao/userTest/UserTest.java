package com.liutao.userTest;

import com.alibaba.druid.filter.config.ConfigTools;
import com.liutao.application.Application;
import com.liutao.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * Created by liutao on 2017/3/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {
    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserInfoTest() throws Exception {
        System.out.println(ConfigTools.encrypt("root").toString());
    }

    @Test
    public void testJpa(){
        logger.debug(userDao.findUserByName("xionger").toString());
    }
}
