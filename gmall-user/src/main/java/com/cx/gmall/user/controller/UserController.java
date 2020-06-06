package com.cx.gmall.user.controller;

import com.cx.gmall.user.bean.UmsMember;
import com.cx.gmall.user.bean.UmsMemberReceiveAddress;
import com.cx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> selAllUmsMember() {
        List<UmsMember> user = userServiceImpl.getAllUser();
        System.out.println("***********************");
        return user;
    }

    @RequestMapping("getAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> selAll(String id) {
        List<UmsMemberReceiveAddress> users = userServiceImpl.getAddress(id);
        return users;
    }

}
