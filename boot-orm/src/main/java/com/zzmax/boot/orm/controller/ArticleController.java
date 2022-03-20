package com.zzmax.boot.orm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zzmax.boot.orm.entity.Article;
import com.zzmax.boot.orm.service.ArticleService;
import com.zzmax.boot.restful.common.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/batch")
    @CrossOrigin
    public AjaxResponse getAllArticle(){
        return AjaxResponse.success(articleService.getAllArticle());
    }

}
