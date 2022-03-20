package com.zzmax.boot.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Data
@Configuration
@PropertySource(name = "employeeProperties", value = "classpath:employee.properties")
public class Employee {
    /**
     * 使用SpEl读取employee.properties配置文件
     */
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;


    @Value("#{'${employee.names}'.split(',')[0]}")
    private String firstName;

    @Value("#{${employee.age}}")
    private Map<String,String> employeeAge;

    @Value("#{${employee.age}['four'] != null ? ${employee.age}['four'] : 80}")
    private String ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;
}
