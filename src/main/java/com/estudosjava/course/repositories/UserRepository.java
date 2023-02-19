package com.estudosjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
