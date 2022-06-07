package day07.debugTest.controller;


import day07.debugTest.methods.Add;
import day07.debugTest.pojo.User;
import day07.debugTest.service.ShowSomeThing;
import day07.debugTest.service.impl.ShowSomeThingImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) {
        Add add = new Add();
        int add1 = add.add(3, 5);
        System.out.println(add1);
        ShowSomeThingImpl showSomeThing = new ShowSomeThingImpl();

        System.out.println(showSomeThing.show("天气好吗"));

        List<String> ids = new ArrayList<>();
        ids.add("1");
        System.out.println(ids.size());
        User user = new User();
        user.setId(1);
        Runnable getId = user::getId;
        System.out.println(getId);
        /*
public List<String> checkUserIsWithNode(List<String> userIds) {
        Assert.notNull(userIds, "用户id不可为空");
        LambdaQueryWrapper<SAuUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(SAuUser::getNodeId);
        queryWrapper.in(SAuUser::getId, userIds);
        queryWrapper.eq(SAuUser::getDeleteflag, 0);
        List<SAuUser> userList = isAuUserService.list(queryWrapper);
        // 获取用户对应的节点id集合
        return userList.stream().map(SAuUser::getNodeId).distinct().collect(Collectors.toList());
    }
         */

        List<User> users = new ArrayList<>();
        users.clear();
        users.add(0, new User(0,"aa"));
        users.add(1, new User(1,"bb"));
        System.out.println(users.stream().map(User::getId).distinct().collect(Collectors.toList()));


    }
}
