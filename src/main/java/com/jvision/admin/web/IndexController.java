package com.jvision.admin.web;

import com.jvision.admin.config.auth.dto.SessionUser;
import com.jvision.admin.service.posts.PostsService;
import com.jvision.admin.web.dto.PostsResponseDto;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;//추가
    //자동으로 index.mustache를 찾아 보여줌.
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());

        //추가
        SessionUser users = (SessionUser) httpSession.getAttribute("users");
        if(users!=null){
            model.addAttribute("userName", users.getName());
        }

        return "index";

    }

    //posts-save.mustache 파일 호출
    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
    //수정 API
    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("posts", dto);
        return "posts-update";
    }
}
