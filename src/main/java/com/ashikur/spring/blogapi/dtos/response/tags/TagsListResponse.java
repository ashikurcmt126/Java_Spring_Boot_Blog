package com.ashikur.spring.blogapi.dtos.response.tags;


import com.ashikur.spring.blogapi.entities.Tag;
import com.ashikur.spring.blogapi.dtos.response.shared.PageMeta;
import com.ashikur.spring.blogapi.dtos.response.shared.PageMetaResponse;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TagsListResponse extends PageMetaResponse {


    private final List<SingleTagDto> tags;

    public TagsListResponse(PageMeta pageMeta, List<SingleTagDto> tagDtos) {
        super(pageMeta);
        this.tags = tagDtos;
    }

    public static TagsListResponse build(Page<Tag> tags, String basePath) {
        List<SingleTagDto> tagDtos = tags.stream()
                .map(SingleTagDto::build)
                .collect(Collectors.toList());

        return new TagsListResponse(PageMeta.build(tags, basePath), tagDtos);
    }

    public static TagsListResponse build(Collection<Tag> tags, String basePath) {
        List<SingleTagDto> tagDtos = tags.stream()
                .map(t -> SingleTagDto.build(t))
                .collect(Collectors.toList());

        return new TagsListResponse(null, tagDtos);
    }

    public List<SingleTagDto> getTags() {
        return tags;
    }
}
