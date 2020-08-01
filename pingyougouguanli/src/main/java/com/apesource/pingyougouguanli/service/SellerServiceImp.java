package com.apesource.pingyougouguanli.service;

import com.apesource.pingyougouguanli.dao.ISellerDao;
import com.apesource.pingyougouguanli.pojo.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImp implements ISellerService {
    @Autowired(required = false)
    ISellerDao dao;



    @Override
    public List<Seller> findByStatus2() {
        return dao.findByStatus2();
    }

    @Override
    public List<Seller> findAll() {
        return dao.findAll();
    }

    @Override
    public int uodate1(int sellerId) {
       return dao.uodate1(sellerId);
    }

    @Override
    public int guanbi(int sellerId) {
        return dao.guanbi(sellerId);
    }

    @Override
    public List<Seller> sousuoshenhe(Seller seller) {
        return dao.sousuoshenhe(seller);
    }

    @Override
    public List<Seller> souguanli(Seller seller) {
        return dao.souguanli(seller);
    }


}
