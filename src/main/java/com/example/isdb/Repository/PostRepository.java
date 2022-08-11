package com.example.isdb.Repository;

import com.example.isdb.model.Post;
import com.example.isdb.model.ScamReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Override
    List<Post> findAll();
}
