package com.example.isdb.Repository;

import com.example.isdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User getUserByEmail(String email);

    @Query(value = "select * from User where user_name = :user_name", nativeQuery = true  )
    User findByUser_name(String user_name);

    @Query(value = "select * from User where user_name = :user_name", nativeQuery = true  )
    User getUserByUser_name(String user_name);
}