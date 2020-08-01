package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Seller;
import com.apesource.pingyougouguanli.service.SellerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/seller")
public class SellerController {


    @Autowired
    SellerServiceImp service;


    @RequestMapping("/findByStatus2")
    public List<Seller> findByStatus2() {
        System.out.println("222222");
     return service.findByStatus2();
    }
    @RequestMapping("/findAll")
    public List<Seller> findAll() {
        return service.findAll();
    }


    @RequestMapping("/update1")
    public int uodate1( int sellerId){
        System.out.println("审核通过");
        return service.uodate1(sellerId);
    }
    @RequestMapping("/guanbi")
    public int guanbi(int sellerId) {
       return service.guanbi(sellerId);
    }

    @RequestMapping("/sousuoshenhe")
    public List<Seller> sousuoshenhe(@RequestBody Seller seller) {
       return service.sousuoshenhe(seller);
    }

    @RequestMapping("/souguanli")
    public List<Seller> souguanli(@RequestBody Seller seller) {
        return service.souguanli(seller);
    }



}
