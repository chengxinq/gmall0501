package com.cx.gmall.user.mapper;

import com.cx.gmall.user.bean.UmsMember;
import com.cx.gmall.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {


    List<UmsMember> getUserAll();

}
