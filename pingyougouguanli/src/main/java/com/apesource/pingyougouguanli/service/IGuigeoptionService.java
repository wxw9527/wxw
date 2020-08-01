package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.pojo.Tb_specification_option;

import java.util.List;

public interface IGuigeoptionService {
    public int delete(int specId);
    public int add(List<Tb_specification_option> tb_specification_options);
    public List<Tb_specification_option> findById(int specId);
}
