package com.zzmax.boot.restful.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@JsonPropertyOrder(value = {"content","title"})
public class Article {
    private Long id;
    private String title;
    private String author;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    private List<Reader> readerList;

    public static void main(String[] args) throws JsonProcessingException {
        Reader reader = new Reader("zzmax",21);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(reader);

        Reader zzmax =  objectMapper.readValue(jsonStr,Reader.class);


        System.out.println("o->j : " + jsonStr);
        System.out.println("j->o : " + zzmax);
    }
}
