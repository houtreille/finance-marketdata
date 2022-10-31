package org.eblood.marketdata.repository;


import org.eblood.marketdata.model.referenceData.MarketRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarketRateRepository extends MongoRepository<MarketRate, String> {
    List<MarketRate> findAllByTicker(String ticker);
    List<MarketRate> findAll();
}
