package cn.com.codinghub.dao.impl;

import cn.com.codinghub.dao.UserDao;

/**
 * @version: V1.0
 * @author: codinghub
 * @className:
 * @packageName: cn.com.codinghub.dao.impl
 * @description: 数据操作层的MySQL实现
 * @date: 2023-09-19 20:45
 **/
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("用户登录MySQL");
    }
}
