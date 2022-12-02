package com.ashikur.spring.blogapi.entities.extensions;

import com.ashikur.spring.blogapi.entities.FileUpload;

public class UploadExtension extends FileUpload {

    private Long articleId;

    public UploadExtension(Long id, String path, Long articleId) {
        this.articleId = articleId;
        this.filePath = path;
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }
}
