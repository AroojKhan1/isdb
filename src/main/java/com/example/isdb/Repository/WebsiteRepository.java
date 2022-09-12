package com.example.isdb.Repository;

import com.example.isdb.model.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebsiteRepository extends JpaRepository <Website,Long>{
    @Query(value = "select * from website where url = :url", nativeQuery = true)
    Website findByUrl(String url);

    @Override
    List <Website> findAll();


}
