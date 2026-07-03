package com.gymprogress.gymprogress.persistance.repository.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.Article;

@Repository
public interface IArticleRepository extends JpaRepository<Article, Integer> {

    
}
