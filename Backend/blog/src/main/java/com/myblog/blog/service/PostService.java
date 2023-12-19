package com.myblog.blog.service;

import com.myblog.blog.model.Post;
import com.myblog.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post) {
        // Implement the logic to save a new post
        return postRepository.save(post);
    }

    // Add methods for updating, deleting, and other operations
}
