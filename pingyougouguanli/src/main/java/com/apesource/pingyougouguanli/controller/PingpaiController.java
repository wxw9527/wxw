package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_brand;
import com.apesource.pingyougouguanli.service.PingpaiServiceImp;
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
@RequestMapping("/pingpai")
public class PingpaiController {
    @Autowired
    PingpaiServiceImp serviceImp;

    @RequestMapping("/findAll")
    public List<Tb_brand> findAll() {
        return serviceImp.findAll();
    }

    @RequestMapping("/sousuo")
    public List<Tb_brand> sousuo(@RequestBody Tb_brand tb_brand) {
        return serviceImp.sousuo(tb_brand);
    }

    @RequestMapping("/add")
    public int add(@RequestBody Tb_brand tb_brand) {
       return serviceImp.add(tb_brand);
    }
    @RequestMapping("/update")
    public int update(@RequestBody Tb_brand tb_brand) {
      return serviceImp.update(tb_brand);
    }
    @RequestMapping("/delete")
    public int delete(int id) {
       return serviceImp.delete(id);
    }

}
