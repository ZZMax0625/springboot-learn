package com.zzmax.boot.service;

import lombok.Data;

@Data
public class TestBeanService1 {
    private String name;


    public TestBeanService1() {
    }

    public TestBeanService1(String name) {
        this.name = name;
    }
}
