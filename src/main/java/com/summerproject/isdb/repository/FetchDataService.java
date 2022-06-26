package com.summerproject.isdb.repository;

import com.summerproject.isdb.models.WebsitesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<WebsitesModel,Long> {
    @Override
    List<WebsitesModel> findAll();


}
