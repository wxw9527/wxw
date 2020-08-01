package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IPingpaiDao;
import com.apesource.pingyougouguanli.pojo.Tb_brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PingpaiServiceImp implements IPingpaiService{
    @Autowired(required = false)
    IPingpaiDao dao;
    @Override
    public List<Tb_brand> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Tb_brand> sousuo(Tb_brand tb_brand) {
        return dao.sousuo(tb_brand);
    }

    @Override
    public int add(Tb_brand tb_brand) {
      return dao.add(tb_brand);
    }

    @Override
    public int update(Tb_brand tb_brand) {
       return dao.update(tb_brand);
    }

    @Override
    public int delete(int id) {
      return dao.delete(id);
    }
}
