package com.example.isdb.Repository;

import com.example.isdb.model.Post;
import com.example.isdb.model.Replies;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ThreadRepository extends CrudRepository<Replies, Long> {
    @Override
    List<Replies> findAll();

}