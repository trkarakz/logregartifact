package com.logreg.logregartifact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logreg.logregartifact.entity.User;

// We can use JpaRepository’s methods: 
// save(), findOne(), findById(), findAll(), count(), delete(), deleteById()… 
// without implementing these methods.
public interface UserRepository extends JpaRepository<User, Long> { 
    
    // Optional<User> findByEmail(String email) throws UserNotFoundException;
    // void deleteByEmail(String email);
}
