package com.apesource.pingyougouguanli.dao;

import com.apesource.pingyougouguanli.pojo.Seller;
import com.apesource.pingyougouguanli.pojo.Tb_content_category;

public class Dtsql {

        public String guanggaostyleSql(Tb_content_category tb_content_category){

            String sql="select * from tb_content_category where 1=1";
            if(tb_content_category.getName()!=null){
                    sql+="and tb_content_category.name=#{name}";
            }
          return sql;
        }
    //搜索商家审核模块
    public String findSql(Seller seller){
        String sql="select * from seller where status =2";
        if (seller.getName()!=null){
            sql+=" and name like '%${name}%'";
        }
        if (seller.getNickName()!=null){
            sql+=" and nick_name like '%${nickName}%'";
        }

        return sql;

    }

    //搜索商家管理模块
    public String findSql2(Seller seller){
        String sql="select * from seller where 1=1";
        if(seller.getName()!=null){
            sql+=" and name like '%${name}%'";
        }
        if(seller.getNickName()!=null){
            sql+=" and nick_name like '%${nickName}%'";
        }
        if(seller.getStatus()!=0){
            sql+=" and status=#{status}";
        }
        System.out.println(sql);
        return  sql;


    }





        
}
