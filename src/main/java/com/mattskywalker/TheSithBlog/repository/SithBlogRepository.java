package com.mattskywalker.TheSithBlog.repository;

import com.mattskywalker.TheSithBlog.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SithBlogRepository extends JpaRepository<Post, Long> {
}
