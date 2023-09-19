package cn.com.codinghub.dao.impl;

import cn.com.codinghub.dao.UserDao;

/**
 * @version: V1.0
 * @author: codinghub
 * @className:
 * @packageName: cn.com.codinghub.dao.impl
 * @description: 数据操作层的Oracle实现
 * @dat: 2023-09-19 20:46
 **/
public class UserDaoOracleImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("用户登录Oracle");
    }
}
