package com.spring.Codeblog.repository;

import com.spring.Codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
