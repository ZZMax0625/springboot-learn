package com.zzmax.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest {
    //注入spring的上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService(){
        // 从测试环境的spring上下文中去读取xml配置文件，得到teatBeanService
        boolean flag = ioc.containsBean("testBeanService");
        assertTrue(flag);
        flag = ioc.containsBean("testBeanService1");
        assertTrue(flag);

        TestBeanService tbs = (TestBeanService) ioc.getBean("testBeanService");
        TestBeanService1 tbs1 = (TestBeanService1) ioc.getBean("testBeanService1");

        assertEquals("SpringBoot",tbs.getName());
        assertEquals("config",tbs1.getName());
    }
}