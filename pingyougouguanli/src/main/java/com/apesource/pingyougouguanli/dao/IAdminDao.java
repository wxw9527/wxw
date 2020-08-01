package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IAdminDao {


    @Select("select * from admin where account=#{account} and loginpwd=#{loginpwd}")
    public Admin login(Admin a);



}
