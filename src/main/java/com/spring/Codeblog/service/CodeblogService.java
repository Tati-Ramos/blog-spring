package com.spring.Codeblog.service;

import com.spring.Codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
