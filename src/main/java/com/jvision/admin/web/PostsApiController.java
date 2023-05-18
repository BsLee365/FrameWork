package com.jvision.admin.web;

import com.jvision.admin.service.posts.PostsService;
import com.jvision.admin.web.dto.PostsSaveRequestDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    /*
    컨트롤러의 역할은 사용자 요청 정보를 받아서
    그대로 객체(Dto)로 바꿔서 그것을 서비스에 전송함.
     */
    @PostMapping("/api/vi/posts") //vi & v1?
    public long save(@RequestBody PostsSaveRequestDto requestDto){

        return postsService.save(requestDto);
    }
}
