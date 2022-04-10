package com.exmple.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exmple.demo.user.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
