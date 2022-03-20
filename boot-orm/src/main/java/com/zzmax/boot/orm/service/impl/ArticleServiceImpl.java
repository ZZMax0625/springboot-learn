package com.zzmax.boot.orm.service.impl;

import com.zzmax.boot.orm.dao.ArticleMapper;
import com.zzmax.boot.orm.entity.Article;
import com.zzmax.boot.orm.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public ArrayList<Article> getAllArticle() {

        return articleMapper.selectAllArticle();
    }
}
