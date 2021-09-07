package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author zhangxin
 * @title
 * @Package com.controller
 * @date 8/15/21 4:33 下午
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {


    @RequestMapping("/fileUpload")
    public String fileUpload(String username, MultipartFile filePic) throws IOException {
        System.out.println(username);
        // 获取原始的文件名
        String filename = filePic.getOriginalFilename();
        filePic.transferTo(new File("/Users/zhangxin/myfile/" + username));
        return "index";
    }

    // 多文件上传
    @RequestMapping("/filesUpload")
    public String filesUpload(String username, MultipartFile[] filePic) throws IOException {
        // 获取原始的文件名
        for (MultipartFile multipartFile : filePic) {
            String filename = multipartFile.getOriginalFilename();
            System.out.println(filename);
            multipartFile.transferTo(new File("/Users/zhangxin/myfile/" + filename));
        }
        return "index";
    }
}
