package com.ashikur.spring.blogapi.services.delegates;

import com.ashikur.spring.blogapi.services.AuthorizationService;
import com.ashikur.spring.blogapi.entities.Like;
import com.ashikur.spring.blogapi.entities.User;

public class LikesAuthorizationDelegate {
    private final AuthorizationService authorizationService;

    public LikesAuthorizationDelegate(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    public boolean canLikeArticles(User user) {
        return user != null && user.getId() != null;
    }

    public boolean canDeleteLikes(Like like, User user) {
        return user != null && user.getId() != null && like != null && like.getUser().getId().equals(user.getId());
    }
}
