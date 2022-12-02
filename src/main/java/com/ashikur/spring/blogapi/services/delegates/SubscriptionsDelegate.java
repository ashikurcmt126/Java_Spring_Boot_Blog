package com.ashikur.spring.blogapi.services.delegates;

import com.ashikur.spring.blogapi.services.AuthorizationService;
import com.ashikur.spring.blogapi.entities.User;
import com.ashikur.spring.blogapi.entities.UserSubscription;

public class SubscriptionsDelegate {
    private final AuthorizationService authorizationService;

    public SubscriptionsDelegate(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    public boolean canSubscribe(User following, User follower) {
        return following != null && follower != null
                && (authorizationService.isAuthor(following) || authorizationService.isAdmin(following))
                && authorizationService.isUserAuthenticated(follower)
                ;
    }

    public boolean canSubscribe(User following) {
        return following != null && authorizationService.isUserAuthenticated() && authorizationService.isAuthor(following);
    }

    public boolean canUnSubscribe(UserSubscription subscription, User follower) {
        return follower != null && subscription != null &&
                (authorizationService.isCurrentUserAdmin() || (subscription.getFollower().getId().equals(follower.getId())));
    }
}
