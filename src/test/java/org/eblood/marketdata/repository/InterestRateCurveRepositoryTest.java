package org.eblood.marketdata.repository;

import org.eblood.marketdata.model.referenceData.InterestRate;
import org.eblood.marketdata.model.referenceData.InterestRateCurve;
import org.eblood.marketdata.model.referenceData.enums.ResetFrequencyEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class InterestRateCurveRepositoryTest {



    @Autowired
    InterestRateCurveRepository interestRateCurveRepository;

    static InterestRateCurve rateCurve = null;


    @BeforeAll
    static void createRateCurve(){


        InterestRate on = InterestRate.builder()
                .description("Overnight Index Rate")
                .ticker("EONIA")
                .build();

        InterestRate _1w = InterestRate.builder()
                .description("1M Index Rate")
                .ticker("EUSW1")
                .build();


        rateCurve = InterestRateCurve.builder()
                .resetFrequency(ResetFrequencyEnum.THREE_MONTHS)
                .curveName("EUR_3M")
                .currency("EUR")
                .description("EUR 3 Months Curve")
                .rateCurvePlots(Arrays.asList(on, _1w))
                .build();


    }

    @Test
    public void saveInterestRateCurve(){
        interestRateCurveRepository.save(rateCurve);
       // assertThat(interestRateCurveRepository.findAll().contains(rateCurve)).isTrue();
    }





}