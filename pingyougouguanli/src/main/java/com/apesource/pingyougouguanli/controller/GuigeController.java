package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_specification;
import com.apesource.pingyougouguanli.service.GuigeServiceImp;
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
@RequestMapping("/guige")
public class GuigeController {


    @Autowired
    GuigeServiceImp serviceImp;


    @RequestMapping("/findAll")
    public List<Tb_specification> findAll() {
       return serviceImp.findAll();
    }
    @RequestMapping("/sousuo")
    public List<Tb_specification> sousuo(@RequestBody Tb_specification tb_specification) {
       return serviceImp.sousuo(tb_specification);
    }
    @RequestMapping("/delete")
    public int delete(int id) {
        return serviceImp.delete(id);
    }
    @RequestMapping("/add")
    public int add(@RequestBody Tb_specification tb_specification) {


      int i= serviceImp.add(tb_specification);
        System.out.println(tb_specification.getId());
      return  tb_specification.getId();

    }

}
