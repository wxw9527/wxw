package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Tb_content;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IGuanggaoglDao {

    //全查
    @Select("select tc.*,ta.* from tb_content tc,tb_content_category ta where tc.category_id=ta.id")
    @Results(id="map1",value = {
            @Result(id=true,property = "id",column = "id"),

            @Result(id=false,property = "categoryId",column = "category_id"),
            @Result(id=false,property = "tb_content_category.name",column = "name"),

            @Result(id=false,property = "title",column = "title"),
            @Result(id=false,property = "url",column = "url"),
            @Result(id=false,property = "pic",column = "pic"),
            @Result(id=false,property = "status",column = "status"),
            @Result(id=false,property = "sortOrder",column = "sort_order")
    })
    public List<Tb_content> findAll();

    // 新增
    @Insert("insert into tb_content (category_id,title,url,pic,status,sort_order) values (#{categoryId},#{title},#{url},#{pic},#{status},#{sortOrder})")
    public int add(Tb_content tb_content);

    //修改
    @Update("update tb_content set category_id=#{categoryId},title=#{title},url=#{url},status=#{status},sort_order=#{sortOrder where id=#{id}}")
    public int update(Tb_content tb_content);

    //删除
    @Delete("delete from tb_content where id=#{id}")
    public int deleteById(int id);



}
