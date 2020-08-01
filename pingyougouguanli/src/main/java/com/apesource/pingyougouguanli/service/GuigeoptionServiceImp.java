package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IGuigeoptionDao;
import com.apesource.pingyougouguanli.pojo.Tb_specification_option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuigeoptionServiceImp implements IGuigeoptionService{
    @Autowired(required = false)
    IGuigeoptionDao dao;
    @Override
    public int delete(int specId) {
       return dao.delete(specId);
    }

    @Override
    public int add(List<Tb_specification_option> tb_specification_options) {
        return dao.add(tb_specification_options);
    }

    @Override
    public List<Tb_specification_option> findById(int specId) {
       return dao.findById(specId);
    }
}
