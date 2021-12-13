package com.example.demospringbatch.batch;

import com.example.demospringbatch.model.BusinessFinancialData;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<BusinessFinancialData, BusinessFinancialData> {

    @Override
    public BusinessFinancialData process(BusinessFinancialData businessFinancialData) throws Exception {
        return businessFinancialData;
    }
}
