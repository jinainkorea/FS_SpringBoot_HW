package com.mysite.ch2.Article;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Article findByTitle(String subject);
    Article findByTitleAndContent(String subject, String content);
    List<Article> findByTitleLike(String subject);
    Page<Article> findAll(Pageable pageable);
}