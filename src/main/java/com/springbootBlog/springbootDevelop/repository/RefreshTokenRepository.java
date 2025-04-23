package com.springbootBlog.springbootDevelop.repository;

import com.springbootBlog.springbootDevelop.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

}
