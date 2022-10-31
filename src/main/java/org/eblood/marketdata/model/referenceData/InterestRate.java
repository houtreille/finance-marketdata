package org.eblood.marketdata.model.referenceData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("InterestRate")
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode
public class InterestRate extends MarketRate {


}
