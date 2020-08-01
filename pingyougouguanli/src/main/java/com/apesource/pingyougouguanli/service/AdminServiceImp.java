package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IAdminDao;
import com.apesource.pingyougouguanli.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements IAdminService{
    @Autowired(required = false)
    IAdminDao dao;
    @Override
    public Admin login(Admin a) {
       return dao.login(a);
    }
}
