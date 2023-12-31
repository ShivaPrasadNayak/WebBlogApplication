package com.myblog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.myblog.blog.model.Post; // Adjust the package path if needed
import com.myblog.blog.repository.PostRepository; // Adjust the package path if needed

@RestController
@RequestMapping("/api/posts") // Optional base path for API
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post newPost) {
        Post savedPost = postRepository.save(newPost);
        return ResponseEntity.ok(savedPost);
    }

    // Other methods for fetching, updating, deleting posts
}

