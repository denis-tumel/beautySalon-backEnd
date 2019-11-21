package com.example.beautySalon.repository;

import com.example.beautySalon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Boolean existsByLogin(String login);
    User findByLogin(String login);

    User findUserById(String id);
}
