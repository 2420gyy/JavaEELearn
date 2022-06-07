package com.atgui.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传请求
 */
@Slf4j
@Controller
public class FormTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
//    @GetMapping("/dropzone.html")
//    public String dropzone(){
//        return "form/dropzone";
//    }
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("上传的信息：email={}，username={}，headerImg={}，photos={}",
                email,username,headerImg.getSize(),photos.length);

        if(!headerImg.isEmpty()){
//            保存到文件服务器，OSS服务器
            String originalFilename = headerImg.getOriginalFilename();
//            UUID.randomUUID()
            headerImg.transferTo(new File("D:\\Misc\\CSC\\"+originalFilename));
//            headerImg.transferTo(new File("D:\\Misc\\CSC"+originalFilename));
            System.out.println("完成文件上传");
        }
        if(photos.length > 0){
            for (MultipartFile photo : photos){
                if(!photo.isEmpty()){
                    String originalFilename2 = photo.getOriginalFilename();
//                    也能得到流？？？
                    photo.transferTo(new File("D:\\Misc\\CSC\\"+ UUID.randomUUID()+originalFilename2));
                    System.out.println("完成文件上传");
                }
            }
        }

        return "main";
    }
}
