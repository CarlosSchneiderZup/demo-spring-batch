package com.example.demospringbatch.batch;

import com.example.demospringbatch.model.BusinessFinancialData;
import com.example.demospringbatch.repository.BusinessFinancialDataRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseWriter implements ItemWriter<BusinessFinancialData> {

    @Autowired
    private BusinessFinancialDataRepository repository;

    @Override
    public void write(List<? extends BusinessFinancialData> financialData) throws Exception {

        repository.saveAll(financialData);
    }
}
