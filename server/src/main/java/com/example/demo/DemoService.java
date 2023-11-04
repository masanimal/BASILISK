package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public Response get() {
        String status = "200";
        User user = new User("hoge","100");
        User noUser = null;
        String noError = null;
        String error = "error";
        return new Response(status,noUser,error);
    }
}
