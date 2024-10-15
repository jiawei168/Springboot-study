package org.example.database.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.database.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ArticleServiceTest {

    @Resource
    private ArticleService articleService;
    @Test
    void saveArticle() {
        Article article = Article.builder()
                .title("Spring Boot")
                .author("张三")
                .content("Spring Boot从入门到精通")
                .build();
        Article savedArticle = articleService.saveArticle(article);
        log.info(String.valueOf(savedArticle));
    }

    @Test
    void deleteArticle() {
        articleService.deleteArticle(3L);
    }

    @Test
    void updateArticle() {
        Article article =articleService.getArticle(2L);
        article.setTitle("Spring");
        articleService.updateArticle(article);
    }

    @Test
    void getArticle() {
        Article article = articleService.getArticle(2L);
        log.info(String.valueOf(article));
    }

    @Test
    void getAll() {
        List<Article> articles = articleService.getAll();
       articles.forEach(System.out::println);
    }
}