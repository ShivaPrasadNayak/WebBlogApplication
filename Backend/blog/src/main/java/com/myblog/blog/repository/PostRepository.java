package com.myblog.blog.repository;

import com.myblog.blog.model.Post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	 List<Post> findByAuthor(String author);

}
