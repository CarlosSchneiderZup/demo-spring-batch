package com.example.demospringbatch.repository;

import com.example.demospringbatch.model.BusinessFinancialData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessFinancialDataRepository extends JpaRepository<BusinessFinancialData, Long> {
}
