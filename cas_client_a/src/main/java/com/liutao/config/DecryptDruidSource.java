package com.liutao.config;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据库连接的用户名和密码加密
 *
 * @author LIUTAO
 * @version 2017/4/20
 * @see
 * @since
 */
public class DecryptDruidSource extends DruidDataSource{
    @Override
    public void setUsername(String username) {
        try {
            username = ConfigTools.decrypt(username);

        } catch (Exception e) {
            e.printStackTrace();
        }
        super.setUsername(username);
    }

}
