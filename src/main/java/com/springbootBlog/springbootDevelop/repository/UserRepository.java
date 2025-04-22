package com.springbootBlog.springbootDevelop.repository;

import com.springbootBlog.springbootDevelop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
