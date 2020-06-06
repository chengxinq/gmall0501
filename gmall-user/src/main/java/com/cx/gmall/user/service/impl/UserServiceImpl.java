package com.cx.gmall.user.service.impl;

import com.cx.gmall.user.bean.UmsMember;
import com.cx.gmall.user.bean.UmsMemberReceiveAddress;
import com.cx.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.cx.gmall.user.mapper.UserMapper;
import com.cx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> user = userMapper.selectAll();
        return user;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddress(String id) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("id", id);
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.selectByExample(e);
        return list;
    }
}
