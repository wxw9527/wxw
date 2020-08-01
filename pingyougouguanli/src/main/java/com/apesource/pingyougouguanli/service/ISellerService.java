package com.apesource.pingyougouguanli.service;


import com.apesource.pingyougouguanli.pojo.Seller;

import java.util.List;

public interface ISellerService {

    public List<Seller> findByStatus2();
    public List<Seller> findAll();
    public int uodate1(int sellerId);
    public int guanbi(int sellerId);
    public List<Seller> sousuoshenhe(Seller seller);
    public  List<Seller> souguanli(Seller seller);

}
