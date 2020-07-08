package com.vuba.vacationer.vacationPeriod;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class VacationPeriod {

    @Id
    private String id;

    private Date startDate;

    private Date endDate;

    private int defaultNumberOfDays;
}
