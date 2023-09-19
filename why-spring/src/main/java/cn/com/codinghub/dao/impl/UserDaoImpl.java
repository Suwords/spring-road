package cn.com.codinghub.dao.impl;

import cn.com.codinghub.dao.UserDao;

/**
 * @version: V1.0
 * @author: codinghub
 * @className:
 * @packageName: cn.com.codinghub.dao.impl
 * @description: 数据操作层
 * @date: 2023-09-19 20:41
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("用户登录");
    }
}
