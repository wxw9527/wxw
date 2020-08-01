package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_specification;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IGuigeDao {

    //全查
    @Select("select * from Tb_specification")
    public List<Tb_specification> findAll();

    //搜索
    @Select("select * from tb_specification where spec_name like '%${specName}%'")
    public List<Tb_specification> sousuo(Tb_specification tb_specification);

    //删除

    @Delete("delete from tb_specification where id=#{id}")
    public int delete(int id);

    //新增
    @Insert("insert into tb_specification (spec_name) values(#{specName})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int add(Tb_specification tb_specification);

}
