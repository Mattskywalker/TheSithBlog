package com.mattskywalker.TheSithBlog.service;

import com.mattskywalker.TheSithBlog.post.Post;

import java.util.List;

public interface SithBlogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}
