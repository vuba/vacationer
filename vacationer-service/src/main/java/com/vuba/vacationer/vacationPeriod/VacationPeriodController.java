package com.vuba.vacationer.vacationPeriod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vacation-period")
@Slf4j
public class VacationPeriodController {

    private final VacationPeriodService vacationPeriodService;

    public VacationPeriodController(VacationPeriodService vacationPeriodService){
        this.vacationPeriodService = vacationPeriodService;
    }

    @GetMapping
    public List<VacationPeriod> findAll(){
        LOG.debug("findAll");
        return vacationPeriodService.findAll();
    }

    @PostMapping
    public VacationPeriod save(@RequestBody VacationPeriod vacationPeriod){
        LOG.debug("save [{}]", vacationPeriod);
        return vacationPeriodService.save(vacationPeriod);
    }
}
