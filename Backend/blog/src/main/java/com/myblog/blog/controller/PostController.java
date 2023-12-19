package com.myblog.blog.controller;

import com.myblog.blog.model.Post;
import com.myblog.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "http://localhost:3000") // Replace with your React app's URL
public class PostController {

    @Autowired
    private PostService postService;

    // Define your API endpoints here
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

}
