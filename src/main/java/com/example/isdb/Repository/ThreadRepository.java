package com.example.isdb.Repository;

import com.example.isdb.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThreadRepository extends CrudRepository<Thread, Long> {
    @Override
    List<Thread> findAll();
}
