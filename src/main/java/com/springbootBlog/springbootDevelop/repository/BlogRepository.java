package com.springbootBlog.springbootDevelop.repository;

import com.springbootBlog.springbootDevelop.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
