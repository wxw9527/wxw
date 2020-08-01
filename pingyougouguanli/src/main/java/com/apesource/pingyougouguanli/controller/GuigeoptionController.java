package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_specification_option;
import com.apesource.pingyougouguanli.service.GuigeoptionServiceImp;
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
@RequestMapping("/guigeoption")
public class GuigeoptionController {
    @Autowired(required = false)
    GuigeoptionServiceImp serviceImp;

    @RequestMapping("/delete")
    public int delete(int specId) {
      return serviceImp.delete(specId);
    }
    @RequestMapping("/add")
    public int add(@RequestBody List<Tb_specification_option> tb_specification_options) {
       return serviceImp.add(tb_specification_options);
    }
    @RequestMapping("/findById")
    public List<Tb_specification_option> findById(int specId) {
       return serviceImp.findById(specId);
    }


}
