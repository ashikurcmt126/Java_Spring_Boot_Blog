package com.ashikur.spring.blogapi.dtos.response.likes.partials;

import com.ashikur.spring.blogapi.dtos.response.articles.partials.ArticleElementalDto;
import com.ashikur.spring.blogapi.entities.Like;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ashikur.spring.blogapi.dtos.response.users.partials.UserIdAndUsernameDto;

public class AdminLikeSummary extends LikeSummaryDto {

    @JsonProperty("user")
    private final UserIdAndUsernameDto userDto;

    private AdminLikeSummary(ArticleElementalDto articleDto, UserIdAndUsernameDto userDto) {
        super(articleDto);
        this.userDto = userDto;
    }

    public static AdminLikeSummary build(Like like) {
        return new AdminLikeSummary(ArticleElementalDto.build(like.getArticle()), UserIdAndUsernameDto.build(like.getUser()));
    }

    public UserIdAndUsernameDto getUserDto() {
        return userDto;
    }
}
