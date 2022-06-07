package com.atgui.admin.mapper;

import com.atgui.admin.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper extends BaseMapper<User> {
//    Mapper继承这个接口后，无需编写mapper.xml文件，即可获得crud功能


}
