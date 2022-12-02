package com.ashikur.spring.blogapi.repository;

import com.ashikur.spring.blogapi.entities.UserRole;
import com.ashikur.spring.blogapi.entities.UserRolePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, UserRolePK> {
}
