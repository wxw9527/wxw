package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_item_cat;

import java.util.List;

public interface IFengleiService {
    public List<Tb_item_cat> findyiji();
    public List<Tb_item_cat> xiaji(int id);

    public int add(Tb_item_cat tb_item_cat);
    public int update(Tb_item_cat tb_item_cat);


}
