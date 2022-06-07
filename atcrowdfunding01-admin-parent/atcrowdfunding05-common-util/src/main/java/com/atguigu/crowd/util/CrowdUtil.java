package com.atguigu.crowd.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 判断当前请求是否为ajax请求
 * return true 是ajax请求
 */
public class CrowdUtil {
    public static boolean judgeRequestType(HttpServletRequest request){
//        判断请求的类型 X-Requested-With: XMLHttpRequest
        String acceptHeader = request.getHeader("Accept");
        String xRequestHeader = request.getHeader("X-Requested-With");
        return  ((acceptHeader!=null && acceptHeader.contains("application/json"))
                || (xRequestHeader != null && xRequestHeader.equals("XMLHttpRequest")));
    }
}
