package com.gymprogress.gymprogress.persistance.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class Article {

    @Id
    @Column(name = "article_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int articleId;

    @Basic
    @Column(name = "article_image", nullable = true, length = 255)
    private String articleImage;

    @Basic
    @Column(name = "article_title", nullable = false, length = 50)
    private String articleTitle;

    @Basic
    @Column(name = "article_description", nullable = false)
    private String articleDescription;
}
