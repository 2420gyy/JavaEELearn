package com.atgui.admin.config;

import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义文件上传
 * 不会。。。。
 */
public class MultipartConfig implements MultipartResolver {
    @Override
    public boolean isMultipart(HttpServletRequest httpServletRequest) {
        return false;
    }

    @Override
    public MultipartHttpServletRequest resolveMultipart(HttpServletRequest httpServletRequest) throws MultipartException {
        return null;
    }

    @Override
    public void cleanupMultipart(MultipartHttpServletRequest multipartHttpServletRequest) {

    }
}
