package com.vuba.vacationer.employee;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Vacations {

    private Date startDate;
    private Date endDate;
    private int numberOfVacationDays;
    private List<VacationRequest> vacationRequests;
}
