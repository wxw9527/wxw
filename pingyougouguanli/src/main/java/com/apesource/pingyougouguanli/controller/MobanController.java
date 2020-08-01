package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_type_template;
import com.apesource.pingyougouguanli.service.MobanServiceImp;
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
@RequestMapping("/moban")
public class MobanController {
    @Autowired
    MobanServiceImp serviceImp;

    @RequestMapping("/findAll")
    public List<Tb_type_template> findAll() {
      return serviceImp.findAll();
    }

    @RequestMapping("/findByName")
    public List<Tb_type_template> findByName(@RequestBody Tb_type_template tb_type_template) {
       return serviceImp.findByName(tb_type_template);
    }
        @RequestMapping("/add")
    public int add(@RequestBody Tb_type_template tb_type_template) {
        return serviceImp.add(tb_type_template);
    }

    @RequestMapping("/delete")
    public int delete(int id) {
        return serviceImp.delete(id);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Tb_type_template tb_type_template) {
        return serviceImp.update(tb_type_template);
    }


}
