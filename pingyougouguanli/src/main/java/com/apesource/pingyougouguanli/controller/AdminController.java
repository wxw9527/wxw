package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Admin;
import com.apesource.pingyougouguanli.service.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminServiceImp serviceImp;

    @RequestMapping("/login")
    public Admin login(@RequestBody Admin a) {
        return serviceImp.login(a);
    }

}
