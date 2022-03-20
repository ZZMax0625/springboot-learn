package com.zzmax.boot.orm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor

public class Article implements Serializable {
    private Long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private String address;

}
