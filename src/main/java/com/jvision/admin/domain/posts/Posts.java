package com.jvision.admin.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

@Entity
//Entity를 붙이는 순간 Table로 인식함.
public class Posts {

    @Id //PK
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //더티 체킹
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
