package com.ashikur.spring.blogapi.dtos.response.shared;


import com.ashikur.spring.blogapi.dtos.response.base.SuccessResponse;

public class PageMetaResponse extends SuccessResponse {
    private final PageMeta pageMeta;

    public PageMetaResponse(PageMeta pageMeta) {
        this.pageMeta = pageMeta;
    }

    public PageMeta getPageMeta() {
        return pageMeta;
    }
}
