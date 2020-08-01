package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_specification;

import java.util.List;

public interface IGuigeService {
    public List<Tb_specification> findAll();
    public List<Tb_specification> sousuo(Tb_specification tb_specification);
    public int delete(int id);
    public int add(Tb_specification tb_specification);
}
