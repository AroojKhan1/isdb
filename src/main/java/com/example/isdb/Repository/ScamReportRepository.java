package com.example.isdb.Repository;

import com.example.isdb.model.ScamReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ScamReportRepository extends JpaRepository<ScamReport, Long> {
    @Override
    List<ScamReport> findAll();

}
