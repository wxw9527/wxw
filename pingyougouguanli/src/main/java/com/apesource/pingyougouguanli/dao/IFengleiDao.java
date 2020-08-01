package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_item_cat;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface IFengleiDao {

    //查一级目录
    @Select("select * from tb_item_cat where parent_id=0")
    public List<Tb_item_cat> findyiji();

    //查询下级目录
    @Select("select * from tb_item_cat where parent_id=#{id}")
    public List<Tb_item_cat> xiaji(int id);

    //新增
    @Insert("insert into tb_item_cat (parent_id,name) values(#{parentId},#{name})")
    public int add(Tb_item_cat tb_item_cat);

    //修改
    @Update("update tb_item_cat set name=#{name} where id=#{id}")
    public int update(Tb_item_cat tb_item_cat);






}
