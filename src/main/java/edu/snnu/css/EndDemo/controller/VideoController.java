package edu.snnu.css.EndDemo.controller;

import edu.snnu.css.EndDemo.entity.Video;
import edu.snnu.css.EndDemo.service.Impl.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

@RestController
public class VideoController {
    @Autowired
    VideoServiceImpl videoService;

    @GetMapping("/videop/")
    public Map getVideoInJson(){
        return (Map) videoService.findall();
    }

    @GetMapping("/video/{id}")
    public Optional<Video> getVideoByIdInJson(@RequestParam int id){
        return videoService.findById(id);
    }

    @PutMapping("/video/")
    public Video putVideoInjson(@RequestParam("file")MultipartFile file){

        if(file.isEmpty()){
            return null;
        }
        if(file.getSize()>104857600){
            System.out.println("msg"+"文件不能大于100MB");
            return null;
        }

        String fileName = file.getOriginalFilename();
        String filePath = "~\\video\\";
        File dest = new File(filePath + fileName);

        try {
          file.transferTo(dest);
          System.out.println("msg"+"上传成功");
          videoService.add(new Video(fileName));
          return null;
        } catch (IOException e) {
          System.out.println(e.toString()+ e);
        }
        System.out.println("msg"+"上传失败");
        return null;
        }
}
