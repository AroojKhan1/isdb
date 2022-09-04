package com.example.isdb.Repository;

import com.example.isdb.model.Post;
import com.example.isdb.model.ScamReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

}
