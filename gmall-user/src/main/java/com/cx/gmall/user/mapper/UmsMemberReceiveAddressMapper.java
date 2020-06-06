package com.cx.gmall.user.mapper;

import com.cx.gmall.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {

    List<UmsMemberReceiveAddress> getAddress(String id);

}
