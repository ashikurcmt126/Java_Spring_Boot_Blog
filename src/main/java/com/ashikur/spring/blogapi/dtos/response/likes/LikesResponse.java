package com.ashikur.spring.blogapi.dtos.response.likes;

import com.ashikur.spring.blogapi.entities.Like;
import com.ashikur.spring.blogapi.dtos.response.base.SuccessResponse;
import com.ashikur.spring.blogapi.dtos.response.likes.partials.LikeDataSection;
import org.springframework.data.domain.Page;

import java.util.Collection;

public class LikesResponse extends SuccessResponse {

    private final LikeDataSection data;

    private LikesResponse(LikeDataSection dataDto) {
        this.data = dataDto;
    }

    public static LikesResponse build(Collection<Like> pagedLikes, String basePath) {
        return new LikesResponse(LikeDataSection.build(pagedLikes, basePath));
    }

    public static LikesResponse build(Page<Like> pagedLikes, String basePath) {

        return new LikesResponse(
                LikeDataSection.build(pagedLikes, basePath)
        );
    }

    public LikeDataSection getData() {
        return data;
    }
}
