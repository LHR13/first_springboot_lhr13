package com.lhr13.first_springboot_lhr13.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class Multuploadcontroller {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/");
    List<String> filesPath = new ArrayList<>();

    @PostMapping("/uploads")
    public String upload(MultipartFile[] uploadFiles, HttpServletRequest request) {
        String realPath =
                request.getSession().getServletContext().getRealPath("/uploadFiles/");
        String format = simpleDateFormat.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        for (MultipartFile uploadFile : uploadFiles)
        {
            String oldName = uploadFile.getOriginalFilename();  //得到上传的文件名
            String newName = UUID.randomUUID().toString() +
                    oldName.substring(oldName.lastIndexOf("."));
            try {
                uploadFile.transferTo(new File(folder, newName));   //springMVC封装的方法，用于将上传的文件保存在服务器上
                String filePath = request.getScheme() + "://" + request.getServerName() +
                        ":" + request.getServerPort() + "/uploadFiles/" + format + newName;
                filesPath.add(filePath);    //getScheme()：request.getScheme() 返回当前链接使用的协议
                //比如，一般应用返回http;SSL返回https;
                //getServerPort()：getServerPort获取的是URL请求的端口
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return filesPath.toString();
    }
}
