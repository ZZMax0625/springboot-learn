package com.zzmax.boot.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@ExtendWith(SpringExtension.class) //Junit5
@SpringBootTest
//@RunWith(SpringRunner.class) //Junit4
class EmployeeTest {

    @Resource
    private Employee employee;

    @Test
    void valueBind() throws Exception{
        log.info(String.valueOf(employee));
//        Map<String,String> map = employee.getEmployeeAge();
//        map.forEach((key,value) -> System.out.println(key + ":" + value));
    }
}