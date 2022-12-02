package com.ashikur.spring.blogapi.dtos.response.likes.partials;

import com.ashikur.spring.blogapi.dtos.response.articles.partials.ArticleElementalDto;
import com.ashikur.spring.blogapi.entities.Like;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LikeSummaryDto {

    @JsonProperty("article")
    private final ArticleElementalDto articleDto;

    public LikeSummaryDto(ArticleElementalDto articleDto) {
        this.articleDto = articleDto;
    }

    public static LikeSummaryDto build(Like like) {
        return new LikeSummaryDto(ArticleElementalDto.build(like.getArticle()));
    }

    public ArticleElementalDto getArticleDto() {
        return articleDto;
    }
}
