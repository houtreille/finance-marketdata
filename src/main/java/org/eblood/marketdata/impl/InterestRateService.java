package org.eblood.marketdata.impl;

import org.eblood.marketdata.model.referenceData.MarketRate;

import java.util.List;

public interface InterestRateService {
    List<MarketRate> getAllInterestRates();

    void save(MarketRate marketRate);

    void delete(MarketRate marketRate);

}
