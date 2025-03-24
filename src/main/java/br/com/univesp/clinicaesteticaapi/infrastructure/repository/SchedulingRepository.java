package br.com.univesp.clinicaesteticaapi.infrastructure.repository;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingHoursResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingResponse;
import br.com.univesp.clinicaesteticaapi.domain.model.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
    List<SchedulingHoursResponse> findScheduleHoursByScheduleDateTime(LocalDate scheduleDateTime);

    List<SchedulingResponse> findSchedulingByScheduleDateTime(LocalDate scheduleDateTime);
}
