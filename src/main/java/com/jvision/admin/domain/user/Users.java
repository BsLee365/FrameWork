package com.jvision.admin.domain.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
//사용자 정보를 담당하는 클래스
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public Users(String name, String email, String picture, Role role){
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }
    public Users update(String name, String picture){
        this.name = name;
        this.picture = picture;
        return this;
    }
    //권한 Key 반환 메소드, ROLE_GUEST와 ROLE_USER
    public String getRolekey(){
        return this.role.getKey();
    }
}
