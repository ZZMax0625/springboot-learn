package com.zzmax.boot.service;

import lombok.Data;

@Data
public class TestBeanService {
    private String name;


    public TestBeanService() {
    }

    public TestBeanService(String name) {
        this.name = name;
    }
}
