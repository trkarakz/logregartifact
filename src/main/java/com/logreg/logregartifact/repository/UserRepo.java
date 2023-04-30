package com.logreg.logregartifact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logreg.logregartifact.model.User;

public interface UserRepo extends JpaRepository<User, Long> { }
