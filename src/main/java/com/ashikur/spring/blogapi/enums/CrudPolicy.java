package com.ashikur.spring.blogapi.enums;

enum CrudPolicy{
    ONLY_ADMIN, ADMIN_AND_OWNER, AUTHENTICATED_USER, ANY
}