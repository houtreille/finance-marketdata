package org.eblood.marketdata.model.referenceData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;



@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
public abstract class MarketRate {

    @Id
    private String ticker = null;
    private String description;

}
