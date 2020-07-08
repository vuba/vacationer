package com.vuba.vacationer.employee;

import lombok.Data;

import java.util.Date;

@Data
public class VacationRequest {

    private String vacationPeriodId;

    private String adminId;

    private Date startDate;

    private Date endDate;

    private Date requestedDate;

    private Date resolvedDate;

    private int numberOfDays;

    private String comment;
}
