package org.eblood.marketdata.model.referenceData;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode
public class InflationRate extends MarketRate {


}
