package com.ComeOnBaby.service;


import com.ComeOnBaby.model.Blog;
import com.ComeOnBaby.model.Likes;

import java.util.List;


public interface BlogService {

    void addNewBlog(Blog blog);

    void updateBlog(Blog blog);

    void deleteBlog(Blog blog);

    List<Blog> getAllBlog();

    Blog findById(Long id);

    List<Blog> findBlogByType(Integer type);

    Likes findLikeInBlogByIdUsers(Long appUserId, Long blogId);
}
