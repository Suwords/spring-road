package cn.com.codinghub.test;

import cn.com.codinghub.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version: V1.0
 * @author: codinghub
 * @className:
 * @packageName: cn.com.codinghub.test
 * @description: Spring样例测试
 *
 * 1、ApplicationContext就是IOC容器的核心入口，可以通过此对象获取容器中创建的对象
 * 2、对象在Spring容器创建完成的时候就已经创建完成，不是需要用的时候才创建
 * 3、对象在IOC容器中存储的时候都是单例的，如果需要多例需要修改属性
 * 4、创建对象给属性赋值的时候是通过setter方法实现的
 * 5、对象的属性是由setter/getter方法决定的，而不是定义的成员属性
 *
 * @date: 2023-09-19 21:07
 **/
public class SpringDemoTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mapper/ioc.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
