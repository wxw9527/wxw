package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IPingpaiDao {

    //全查
    @Select("select * from Tb_brand")
    public List<Tb_brand> findAll();

    //搜索
    @Select("select * from tb_brand where name like '%${name}%'")
    public List<Tb_brand> sousuo(Tb_brand tb_brand);

    //新增
    @Insert("insert into tb_brand (name,first_char) values(#{name},#{firstChar})")
    public int add(Tb_brand tb_brand);

    //修改
    @Update("update tb_brand set name=#{name},first_char=#{firstChar} where id=#{id}")
    public int update(Tb_brand tb_brand);
    
    //删除
    @Delete("delete from tb_brand where id=#{id}")
    public int delete(int id);
}
