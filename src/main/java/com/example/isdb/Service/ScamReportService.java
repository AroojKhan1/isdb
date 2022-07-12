package com.example.isdb.Service;

import com.example.isdb.model.ScamReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScamReportService extends JpaRepository<ScamReport, Long> {
    @Override
    List<ScamReport> findAll();
}
