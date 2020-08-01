package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_item_cat;
import com.apesource.pingyougouguanli.service.FengleiServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/fenglei")
public class FengleiController {
    @Autowired
    FengleiServiceImp serviceImp;

    @RequestMapping("/findyiji")
    public List<Tb_item_cat> findyiji() {
       return serviceImp.findyiji();
    }

    @RequestMapping("/xiaji")
    public List<Tb_item_cat> xiaji(int id) {
       return serviceImp.xiaji(id);
    }

    @RequestMapping("/add")
    public int add(@RequestBody Tb_item_cat tb_item_cat) {
       return serviceImp.add(tb_item_cat);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Tb_item_cat tb_item_cat) {
      return serviceImp.update(tb_item_cat);
    }

}
