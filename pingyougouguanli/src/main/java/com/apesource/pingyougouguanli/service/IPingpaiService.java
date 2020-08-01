package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_brand;

import java.util.List;

public interface IPingpaiService {
    public List<Tb_brand> findAll();
    public List<Tb_brand> sousuo(Tb_brand tb_brand);
    public int add(Tb_brand tb_brand);
    public int update(Tb_brand tb_brand);
    public int delete(int id);
}
