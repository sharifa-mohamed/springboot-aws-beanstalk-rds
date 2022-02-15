package com.sm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
