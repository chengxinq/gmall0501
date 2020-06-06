package com.cx.gmall.user.service;

import com.cx.gmall.user.bean.UmsMember;
import com.cx.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getAddress(String id);
}
