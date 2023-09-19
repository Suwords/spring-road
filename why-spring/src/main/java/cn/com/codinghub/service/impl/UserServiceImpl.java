package cn.com.codinghub.service.impl;

import cn.com.codinghub.dao.UserDao;
import cn.com.codinghub.dao.impl.UserDaoImpl;
import cn.com.codinghub.dao.impl.UserDaoMysqlImpl;
import cn.com.codinghub.dao.impl.UserDaoOracleImpl;
import cn.com.codinghub.service.UserService;

/**
 * @version: V1.0
 * @author: codinghub
 * @className:
 * @packageName: cn.com.codinghub.service.impl
 * @description:
 * 演示在没有Spring时，如果数据层接口有多种实现，
 * 那么需要频繁地修改服务层实现类，这很明显是不满足需求的。
 * 如何调整呢？
 * 可以通过set方法去实现
 * 解耦
 * 控制反转：
 *  - 原先数据层对象是自己去创建的
 *  - 更改之后，数据层对象是注入进去的
 *  - 即依赖的对象被反转了，实际上Spring内部的思想和这里的set方法十分类似
 * @date: 2023-09-19 20:39
 **/
public class UserServiceImpl implements UserService {

//    private final UserDao userDao = new UserDaoImpl();
//    private final UserDao userDao = new UserDaoMysqlImpl();
//    private final UserDao userDao = new UserDaoOracleImpl();

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
        userDao.login();
    }

    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.login();

        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.login();
    }
}
