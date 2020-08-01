package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_type_template;

import java.util.List;

public interface IMobanService {
    public List<Tb_type_template> findAll();
    public List<Tb_type_template> findByName(Tb_type_template tb_type_template);
    public int add(Tb_type_template tb_type_template);
    public int delete(int id);
    public int update(Tb_type_template tb_type_template);
}
