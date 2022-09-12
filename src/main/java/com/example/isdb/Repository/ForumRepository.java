package com.example.isdb.Repository;



import com.example.isdb.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumRepository extends JpaRepository<Post, java.lang.Long> {
    @Override
    List<Post> findAll();
}
