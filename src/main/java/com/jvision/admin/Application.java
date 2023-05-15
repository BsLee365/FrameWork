package com.jvision.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String []args){
        //톰캣 서버를 실행해주는 메소드.
        SpringApplication.run(Application.class,args);
    }
}
