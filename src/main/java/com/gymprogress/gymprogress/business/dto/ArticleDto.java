package com.gymprogress.gymprogress.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {

    private int articleId;
    private String articleImage;
    private String articleTitle;
    private String articleDescription;
    
}
