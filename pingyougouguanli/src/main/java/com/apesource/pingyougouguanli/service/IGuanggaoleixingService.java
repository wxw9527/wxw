package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_content_category;

import java.util.List;

public interface IGuanggaoleixingService {
    public List<Tb_content_category> findAll();
    public int add(Tb_content_category tb_content_category);
    public int update(Tb_content_category tb_content_category);
    public int delete(int id);
    public List<Tb_content_category> findByName(Tb_content_category tb_content_category);
    public int deleteById(int id);
}
