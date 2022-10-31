package org.eblood.marketdata.service;

import org.eblood.marketdata.model.referenceData.MarketRate;

import java.util.List;

public interface InterestRateService {
    List<MarketRate> getAllInterestRates();

    void save(MarketRate marketRate);

    void delete(MarketRate marketRate);

}
