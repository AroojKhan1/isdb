package com.example.isdb.Service;

import com.example.isdb.model.Post;
import com.example.isdb.model.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ForumService extends JpaRepository<Post, Long> {
    @Override
    List<Post> findAll();
}
