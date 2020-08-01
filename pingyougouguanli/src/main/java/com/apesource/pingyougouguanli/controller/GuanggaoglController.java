package com.apesource.pingyougouguanli.controller;

import com.apesource.pingyougouguanli.pojo.Tb_content;
import com.apesource.pingyougouguanli.service.GuanggaoglServiceImp;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/guanggaogl")
public class GuanggaoglController {
    @Autowired
    GuanggaoglServiceImp serviceImp;

    @RequestMapping("/findAll")
    public List<Tb_content> findAll() {
        return serviceImp.findAll();
    }

    @RequestMapping("/add")
    public int add(@RequestBody Tb_content tb_content) {
        return serviceImp.add(tb_content);
    }



    //修改
    @RequestMapping("/update")
    public int update(Tb_content tb_content) {
        return serviceImp.update(tb_content);
    }


    @RequestMapping("/deleteById")
    public int deleteById(@RequestBody List<Tb_content>  multipleSelection) {
        for (Tb_content c:
                multipleSelection){
            serviceImp.deleteById(c.getId());

        }
        return 1;

    }







    //七牛云上传
    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile upload) throws Exception {
        System.out.println("springmvc文件上传...");
        //1.构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.autoRegion());
        //2....其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //3....生成上传凭证，然后准备上传
        String accessKey = "7sMZdi7W1fLOpN1zybWDKJEjc5JnNFdK1V3gq15v";
        String secretKey = "lJ7mXJkjf2ytP9p_zsRPPP3zYwo9kRJhdPmP8ZnQ";
        String bucket = "wei001spring";//存储空间的名字
        //4.默认不指定key的情况下，以文件内容的hash值作为文件名
        // 默认不指定key的情况下，以文件内容的hash值作为文件名，使用hash的好处还可以去除重复图片，重复上传同一张图片，在七牛云中只会占用一个图片的空间。
        String key = null;
        String pname = null;//保存上传文件名称
        try {
            //5.准备文件
            byte[]  uploadBytes= upload.getBytes();
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);

            try {
                Response response = uploadManager.put(uploadBytes, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                //上传成功后的返回的DefaultPutRet对象，里面包含图片的hash值，和图片的key值其实就是文件名。
                System.out.println(putRet.key);//七牛云中图片的名字
                pname = putRet.key;
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception ex) {
            //ignore
        }
        System.out.println("文件名称=========="+pname);
        return pname;
    }







}
