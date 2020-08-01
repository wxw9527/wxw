package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_type_template;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IMobanDao {

    //全查
    @Select("select * from Tb_type_template ")
    public List<Tb_type_template> findAll();

    //搜索
    @Select("select * from Tb_type_template where name like '%${name}%'")
    public List<Tb_type_template> findByName(Tb_type_template tb_type_template);

    //新增
    @Insert("insert into tb_type_template (name,spec_ids,brand_ids) values(#{name},#{specIds},#{brandIds})")
    public int add(Tb_type_template tb_type_template);

    //删除
    @Delete("delete from tb_type_template where id=#{id}")
    public int delete(int id);
    //修改

    @Update("update tb_type_template set name=#{name},spec_ids=#{specIds},brand_ids=#{brandIds} where id=#{id} ")
    public int update(Tb_type_template tb_type_template);
}
