package br.com.univesp.clinicaesteticaapi.domain.service;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingHoursResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest.SchedulingRequest;
import br.com.univesp.clinicaesteticaapi.domain.model.Scheduling;
import br.com.univesp.clinicaesteticaapi.infrastructure.repository.SchedulingRepository;
import br.com.univesp.clinicaesteticaapi.mapper.SchedulingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchedulingService {

    private final SchedulingRepository schedulingRepository;
    private final SchedulingMapper schedulingMapper;

    public SchedulingResponse saveScheduling(SchedulingRequest schedulingRequest) {
        Scheduling scheduling = schedulingMapper.toScheduling(schedulingRequest);
        scheduling = schedulingRepository.save(scheduling);
        return schedulingMapper.toSchedulingResponse(scheduling);
    }

    public List<SchedulingHoursResponse> getScheduleHoursByDate(LocalDate scheduleDateTime) {
        return schedulingMapper.toSchedulingHoursResponseList(
                schedulingRepository.findScheduleHoursByScheduleDateTime(scheduleDateTime));
    }

    public List<SchedulingResponse> getSchedulingByDate(LocalDate scheduleDateTime) {
        return schedulingMapper.toSchedulingResponseList(
                schedulingRepository.findSchedulingByScheduleDateTime(scheduleDateTime));
    }
}
