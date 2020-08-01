package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IMobanDao;
import com.apesource.pingyougouguanli.pojo.Tb_type_template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobanServiceImp implements IMobanService{
    @Autowired(required = false)
    IMobanDao dao;

    @Override
    public List<Tb_type_template> findAll() {
       return dao.findAll();
    }

    @Override
    public List<Tb_type_template> findByName(Tb_type_template tb_type_template) {
      return dao.findByName(tb_type_template);
    }

    @Override
    public int add(Tb_type_template tb_type_template) {
       return dao.add(tb_type_template);
    }

    @Override
    public int delete(int id) {
      return dao.delete(id);
    }

    @Override
    public int update(Tb_type_template tb_type_template) {
       return dao.update(tb_type_template);
    }
}
