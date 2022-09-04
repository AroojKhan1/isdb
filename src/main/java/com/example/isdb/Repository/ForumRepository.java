package com.example.isdb.Repository;



import com.example.isdb.model.Post;

import com.example.isdb.model.ScamReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumRepository extends JpaRepository<Post,Long> {
    @Override
    List<Post> findAll();
}
