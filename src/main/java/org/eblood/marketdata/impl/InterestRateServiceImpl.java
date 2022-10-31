package org.eblood.marketdata.impl;


import org.eblood.marketdata.model.referenceData.MarketRate;
import org.eblood.marketdata.repository.MarketRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestRateServiceImpl implements InterestRateService {

    @Autowired
    MarketRateRepository repository;


    @Override
    public List<MarketRate> getAllInterestRates() {
        return repository.findAll();
    }

    @Override
    public void save(MarketRate marketRate) {
        repository.save(marketRate);
    }

    @Override
    public void delete(MarketRate marketRate) {
        repository.delete(marketRate);
    }
}
