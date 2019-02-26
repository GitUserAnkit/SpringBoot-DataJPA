package com.ankit.spring.jpa.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.spring.jpa.api.model.Users;

public interface UserRespository extends JpaRepository<Users,Long> {

}
