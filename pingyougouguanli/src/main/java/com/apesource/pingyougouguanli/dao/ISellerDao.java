package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Seller;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ISellerDao {

    //查出未审核的商家
    @Select("select * from seller where status=2")
    public List<Seller> findByStatus2();

    //全查
    @Select("select * from seller")
    public List<Seller> findAll();

    //审核通过
    @Update("update seller set status=1 where seller_id=#{sellerId} ")
    public int uodate1(int sellerId );
    
    //关闭商家
    @Update("update seller set status=3 where seller_id=#{sellerId}")
    public int guanbi(int sellerId);

    //商家审核搜索
    @SelectProvider(type = Dtsql.class,method ="findSql")
    public List<Seller> sousuoshenhe(Seller seller);

    //商家管理搜索
    @SelectProvider(type = Dtsql.class,method ="findSql2")
    public  List<Seller> souguanli(Seller seller);

}
