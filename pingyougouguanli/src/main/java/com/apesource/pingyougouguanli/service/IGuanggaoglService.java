package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_content;

import java.util.List;

public interface IGuanggaoglService {
    public List<Tb_content> findAll();
    public int add(Tb_content tb_content);
    public int update(Tb_content tb_content);
    public int deleteById(int id);
}
