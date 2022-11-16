package com.ios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ios.model.User;

@Repository
public interface UserRepository extends  JpaRepository<User, Long>{

}
