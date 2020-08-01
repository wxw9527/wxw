package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IGuanggaoleixingDao;
import com.apesource.pingyougouguanli.pojo.Tb_content_category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuanggaoleixingServiceImp implements IGuanggaoleixingService {
    @Autowired(required = false)
    IGuanggaoleixingDao dao;


    @Override
    public List<Tb_content_category> findAll() {
        return dao.findAll();
    }

    @Override
    public int add(Tb_content_category tb_content_category) {
        return dao.add(tb_content_category);
    }

    @Override
    public int update(Tb_content_category tb_content_category) {
        return dao.update(tb_content_category);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public List<Tb_content_category> findByName(Tb_content_category tb_content_category) {
        return dao.findByName(tb_content_category);
    }

    @Override
    public int deleteById(int id) {
       return dao.deleteById(id);
    }
}
