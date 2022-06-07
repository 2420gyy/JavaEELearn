package day07.debugTest.service.impl;

import day07.debugTest.service.ShowSomeThing;

public class ShowSomeThingImpl implements ShowSomeThing {
    @Override
    public String show(String str) {
        if(str.length()>5){
            str+=" 你的话太长了";
        }else {
            str=str.substring(0,str.length()-1);
        }
        return str;
    }
}
