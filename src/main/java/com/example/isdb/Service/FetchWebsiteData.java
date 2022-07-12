package com.example.isdb.Service;

import com.example.isdb.model.Website;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FetchWebsiteData extends JpaRepository<Website, Long> {
    @Override
    List<Website> findAll();
}
