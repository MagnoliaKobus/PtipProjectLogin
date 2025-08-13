package com.logintest.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logintest.test.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
    boolean existsByUserId(String Id);
    UserEntity findByUserId(String userId);
}