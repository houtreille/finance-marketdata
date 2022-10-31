package org.eblood.marketdata.model.referenceData;

import lombok.Builder;
import lombok.Data;
import org.eblood.marketdata.model.referenceData.enums.ResetFrequencyEnum;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
public class InterestRateCurve {

    @Id
    private String curveName;
    private String currency;
    private String description;
    private ResetFrequencyEnum resetFrequency;
    private List<InterestRate> rateCurvePlots;


}
