package com.vuba.vacationer.vacationPeriod;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacationPeriodRepository extends MongoRepository<VacationPeriod, String> {
}
