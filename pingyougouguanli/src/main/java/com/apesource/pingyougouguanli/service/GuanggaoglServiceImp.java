package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IGuanggaoglDao;
import com.apesource.pingyougouguanli.pojo.Tb_content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuanggaoglServiceImp implements IGuanggaoglService{
    @Autowired(required = false)
    IGuanggaoglDao dao;

    @Override
    public List<Tb_content> findAll() {
        return dao.findAll();
    }

    @Override
    public int add(Tb_content tb_content) {
        return dao.add(tb_content);
    }

    @Override
    public int update(Tb_content tb_content) {
       return dao.update(tb_content);
    }

    @Override
    public int deleteById(int id) {
      return dao.deleteById(id);
    }


}
