package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.IFengleiDao;
import com.apesource.pingyougouguanli.pojo.Tb_item_cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FengleiServiceImp implements IFengleiService{
    @Autowired(required = false)
    IFengleiDao dao;

    @Override
    public List<Tb_item_cat> findyiji() {
      return dao.findyiji();
    }

    @Override
    public List<Tb_item_cat> xiaji(int id) {
        return dao.xiaji(id);
    }

    @Override
    public int add(Tb_item_cat tb_item_cat) {
        return dao.add(tb_item_cat);
    }

    @Override
    public int update(Tb_item_cat tb_item_cat) {
       return dao.update(tb_item_cat);
    }
}
