package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_specification_option;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IGuigeoptionDao {


    //删除
    @Delete("delete from tb_specification_option where spec_id=#{specId}")
    public int delete(int specId);

    /*//新增
    //添加
    @Insert("<script>"+
            "insert into tb_specification_option(option_name, spec_id) values "+
            "<foreach collection='list' item='item' index='index' separator=','>"+
            "(#{item.optionname}, #{item.specid})"+
            "</foreach>"+
            "</script>")
    public int add(List<Tb_Specification_Option> options)*/

    //新增
    @Insert("<script>"+
            "insert into tb_specification_option(option_name, spec_id) values "+
            "<foreach collection='list' item='item' index='index' separator=','>"+
            "(#{item.optionName}, #{item.specId})"+
            "</foreach>"+
            "</script>")
    public int add(List<Tb_specification_option> tb_specification_options);

    //id查询
    @Select("select * from Tb_specification_option where spec_id=#{specId}")
    public List<Tb_specification_option> findById(int specId);
}
