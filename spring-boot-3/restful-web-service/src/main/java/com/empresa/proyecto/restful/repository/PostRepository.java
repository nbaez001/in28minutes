package com.empresa.proyecto.restful.repository;

import com.empresa.proyecto.restful.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
