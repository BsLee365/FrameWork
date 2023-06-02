package com.jvision.admin.config.auth.dto;

import com.jvision.admin.domain.user.Users;
import lombok.Getter;

import java.io.Serializable;
/*
자바 내부 객체를 외부에서 사용가능하도록
byte형태로 변환하는 기술
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(Users users){
        this.name = users.getName();
        this.email = users.getEmail();
        this.picture = users.getPicture();
    }
}
