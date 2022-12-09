package org.eblood.marketdata.controller;

import org.eblood.marketdata.model.referenceData.InterestRate;
import org.eblood.marketdata.model.referenceData.MarketRate;
import org.eblood.marketdata.service.InterestRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:64188")
public class InterestRateController {

    @Autowired
    private InterestRateService service;

    @GetMapping("/interestRate")
    public List<MarketRate> getAllInterestRate(){
        return service.getAllInterestRates();
    }

    @PostMapping("/createInterestRate")
    public void create(@RequestBody MarketRate marketRate){
        service.save(marketRate);
    }

    @PostMapping("/interestRate/createDummy")
    public void createDummy(){

        InterestRate dummyIr = InterestRate.builder()
                        .description("Dummy Rate")
                                .ticker("DUMMY Index")
                                        .build();

        service.save(dummyIr);
    }

}
