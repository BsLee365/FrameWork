package com.jvision.admin.web.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    //자동으로 index.mustache를 찾아 보여줌.
    @GetMapping("/")
    public String index(){
        return "index";
    }

    //posts-save.mustache 파일 호출
    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
