package com.zzmax.boot.model;

import com.zzmax.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:book.yml"},factory = MixPropertySourceFactory.class)
public class User {
    private String name;
    private Integer age;
    private List<Book> book;

}
