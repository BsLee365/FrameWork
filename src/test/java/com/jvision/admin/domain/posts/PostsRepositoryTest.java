package com.jvision.admin.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired //인터페이스 객체를 주입
    PostsRepository postsRepository;

    @After//단위 테스트 후 실행하는 메소드
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){
        String title = "테스트 게시글";
        String content = "테스트 본문";
        //insert into Posts values(" ", " ", " ")
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("이범석")
                .build());

        List<Posts> postsList =  postsRepository.findAll(); //모두 가져왐
        Posts posts = postsList.get(0); //첫 번째 레코드 가져옴.
        assertThat(posts.getTitle()).isEqualTo(title); //title하고 같은지 테스트
        assertThat(posts.getContent()).isEqualTo(content); //content하고 같은지 확인

    }


}

