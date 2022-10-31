package org.eblood.marketdata.impl;

import org.eblood.marketdata.model.referenceData.InterestRate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class InterestRateServiceImplTest {

    @Autowired
    InterestRateService service;


    @Test
    void createInterestThenDeleteIt() {

        InterestRate ir = createInterestRate();

        assertDoesNotThrow(() -> service.save(ir));
        assertThat(service.getAllInterestRates()).hasAtLeastOneElementOfType(InterestRate.class);
        assertDoesNotThrow(() -> service.delete(ir));
        assertThat(service.getAllInterestRates()).hasSize(0);
    }



    private InterestRate createInterestRate(){
        return InterestRate.builder()
                .ticker("DUMMY")
                .description("Dummy rate for test")
                .build();
    }


}