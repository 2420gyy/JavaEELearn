package com.atgui.admin.service.impl;

import com.atgui.admin.bean.User;
import com.atgui.admin.mapper.UserMapper;
import com.atgui.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
//   UserService 没规定什么方法，但是IService有很多方法，所有有一个对顶级service的实现类
//public class ServiceImpl<M extends BaseMapper<T>, T> implements IService<T>
//    BaseMapper 指当前UserServiceImpl操作哪个表用哪个mapper alt + shift + p
//    ???这里写业务，然后这里必须有方法，然后userService.list();这个才能调用？？？
}
