package com.jvision.admin.service.posts;

import com.jvision.admin.domain.posts.PostsRepository;
import com.jvision.admin.web.dto.PostsSaveRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {
    public final PostsRepository postsRepository;

    //트랜잭션 등록
    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
