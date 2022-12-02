package com.ashikur.spring.blogapi.repository;

import com.ashikur.spring.blogapi.entities.FileUpload;
import com.ashikur.spring.blogapi.entities.extensions.UploadExtension;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UploadRepository extends CrudRepository<FileUpload, Long> {

    @Query("select new com.ashikur.spring.blogapi.entities.extensions.UploadExtension(ai.id, ai.filePath, a.id) " +
            "from com.ashikur.spring.blogapi.entities.ArticleImage ai inner join ai.article a where a.id in :ids and upload_type=0")
    List<UploadExtension> getImagesFromArticles(List<Long> ids);
}
