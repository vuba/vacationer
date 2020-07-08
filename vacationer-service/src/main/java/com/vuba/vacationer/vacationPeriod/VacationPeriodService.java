package com.vuba.vacationer.vacationPeriod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class VacationPeriodService {

    private final VacationPeriodRepository vacationPeriodRepository;

    public VacationPeriodService(VacationPeriodRepository vacationPeriodRepository){
        this.vacationPeriodRepository = vacationPeriodRepository;
    }

    public List<VacationPeriod> findAll(){
        LOG.debug("findAll");
        return vacationPeriodRepository.findAll();
    }

    public VacationPeriod save(VacationPeriod vacationPeriod){
        LOG.debug("save [{}]", vacationPeriod);
        return vacationPeriodRepository.save(vacationPeriod);
    }

    public void delete(VacationPeriod vacationPeriod){
        LOG.debug("delete [{}]", vacationPeriod);
        Optional<VacationPeriod> existent = vacationPeriodRepository.findById(vacationPeriod.getId());
        if(existent.isPresent()){
            vacationPeriodRepository.delete(vacationPeriod);
        } else {
            LOG.error("Tried to delete vacation period [{}] that does NOT exist in database");
        }
    }
}
