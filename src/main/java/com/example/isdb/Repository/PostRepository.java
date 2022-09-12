package com.example.isdb.Repository;

import com.example.isdb.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, java.lang.Long> {
    @Override
    List<Post> findAll();
}
