package com.example.id.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component
public class Hello {
  //  @Value("${hello}")
    private String hello1;


    public String getHello1() {
        return hello1;
    }

    public void setHello1(String hello1) {
        this.hello1 = hello1;
    }
}
