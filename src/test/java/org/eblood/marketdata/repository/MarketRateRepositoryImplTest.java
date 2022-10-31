package org.eblood.marketdata.repository;

import org.eblood.marketdata.model.referenceData.InflationRate;
import org.eblood.marketdata.model.referenceData.InterestRate;
import org.eblood.marketdata.model.referenceData.MarketRate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MarketRateRepositoryImplTest {



    String EONIA = "EONIA Index";

    InterestRate marketRate = null;

    @Autowired
    MarketRateRepository marketDataRepository;




    @BeforeEach
    private void createMarketRate(){
        marketRate = InterestRate.builder()
                .description("Overnight Index Rate")
                .ticker(EONIA)
                .build();


    }






    @Test
    void findAllAndDelete() {

        marketDataRepository.save(marketRate);

        List<MarketRate> ratesRetrieved = marketDataRepository.findAll();

        assertThat(ratesRetrieved.contains(marketRate)).isTrue();
    }

    @Test
    void findAllByTickerAndDelete() {
        marketDataRepository.save(marketRate);

        List<MarketRate> ratesRetrieved = marketDataRepository.findAllByTicker(EONIA);

        assertThat(ratesRetrieved.contains(marketRate)).isTrue();
    }


    @Test
    void findAllInflationRateAndDelete() {

        marketDataRepository.save(marketRate);

        InflationRate inflationRate = InflationRate.builder()
                .description("CPTFEMU Index")
                .ticker("CPTFEMU")
                .build();

        marketDataRepository.save(inflationRate);

        List<MarketRate> ratesRetrieved = marketDataRepository.findAll();

        assertThat(ratesRetrieved.contains(inflationRate)).isTrue();

        marketDataRepository.delete(inflationRate);
    }


    @AfterEach
    private void deleteMarketData(){
        marketDataRepository.delete(marketRate);
    }




}