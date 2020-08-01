package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IGuigeDao;
import com.apesource.pingyougouguanli.pojo.Tb_specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuigeServiceImp implements IGuigeService {
    @Autowired(required = false)
    IGuigeDao dao;

    @Override
    public List<Tb_specification> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Tb_specification> sousuo(Tb_specification tb_specification) {
       return dao.sousuo(tb_specification);
    }

    @Override
    public int delete(int id) {
      return dao.delete(id);
    }

    @Override
    public int add(Tb_specification tb_specification) {
        return dao.add(tb_specification);
    }
}
