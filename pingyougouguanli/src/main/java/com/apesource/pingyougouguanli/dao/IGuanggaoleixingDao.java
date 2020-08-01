package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_content_category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IGuanggaoleixingDao {
    //全查
    @Select("select * from tb_content_category")
    public List<Tb_content_category> findAll();


    //新增
    @Insert("insert into tb_content_category(name) values(#{name})")
    public int add(Tb_content_category tb_content_category);

    //修改
    @Update("update tb_content_category set name=#{name} where id=#{id}")
    public int update(Tb_content_category tb_content_category);
    //删除
    @Delete("delete from tb_content_category where id=#{id} ")
    public int delete(int id);

    //搜索

    @Select("select * from tb_content_category where name like '%${name}%'")
    public List<Tb_content_category> findByName(Tb_content_category tb_content_category);

    //删除
    @Delete("delete from tb_content_category where id=#{id}")
    public int deleteById(int id);




}
