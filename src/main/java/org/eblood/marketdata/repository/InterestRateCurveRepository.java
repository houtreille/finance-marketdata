package org.eblood.marketdata.repository;

import org.eblood.marketdata.model.referenceData.InterestRateCurve;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestRateCurveRepository extends MongoRepository<InterestRateCurve, String> {
}
