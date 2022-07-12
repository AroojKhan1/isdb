package com.example.isdb.Repository;

import com.example.isdb.model.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebsiteRepository extends JpaRepository <Website,Long>{

    @Override
    List <Website> findAll();


}
