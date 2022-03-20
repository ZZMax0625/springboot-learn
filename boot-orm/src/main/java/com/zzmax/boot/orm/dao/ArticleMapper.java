package com.zzmax.boot.orm.dao;

import com.zzmax.boot.orm.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;

@Repository
@Mapper
public interface ArticleMapper {
    ArrayList<Article> selectAllArticle();
}
