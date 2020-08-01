package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_content;
import com.apesource.pingyougouguanli.pojo.Tb_content_category;
import com.apesource.pingyougouguanli.service.GuanggaoleixingServiceImp;
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
@RequestMapping("/guanggaoleixing")
public class GuanggaoleixingController {
    @Autowired
    GuanggaoleixingServiceImp service;

    @RequestMapping("/findAll")
    public List<Tb_content_category> findAll() {
        return service.findAll();
    }

    @RequestMapping("/add")
    public int add(@RequestBody Tb_content_category tb_content_category) {
        return service.add(tb_content_category);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Tb_content_category tb_content_category) {
        return service.update(tb_content_category);
    }
    @RequestMapping("/delete")
    public int delete(int id) {
        return service.delete(id);
    }
    @RequestMapping("/findByName")
    public List<Tb_content_category> findByName(@RequestBody Tb_content_category tb_content_category) {
        return service.findByName(tb_content_category);
    }

    @RequestMapping("/deleteById")
    public int deleteById(@RequestBody List<Tb_content_category> multipleSelection) {
        for (Tb_content_category c:
                multipleSelection){
            service.deleteById(c.getId());

        }
        return 1;

    }


}
