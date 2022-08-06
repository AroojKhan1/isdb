package com.example.isdb.Repository;



import com.example.isdb.model.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepository extends CrudRepository<Post,Long> {


}
