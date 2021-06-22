package com.mattskywalker.TheSithBlog.service.serviceImpl;

import com.mattskywalker.TheSithBlog.post.Post;
import com.mattskywalker.TheSithBlog.repository.SithBlogRepository;
import com.mattskywalker.TheSithBlog.service.SithBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SithBlogServiceImpl implements SithBlogService {

    @Autowired
    SithBlogRepository sithBlogRepository;

    @Override
    public List<Post> findAll() {
        return sithBlogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return sithBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return sithBlogRepository.save(post);
    }
}
