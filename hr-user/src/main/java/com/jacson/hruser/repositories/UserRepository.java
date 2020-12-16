package com.jacson.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacson.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
