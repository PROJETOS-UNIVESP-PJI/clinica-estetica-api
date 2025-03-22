package br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest;

import br.com.univesp.clinicaesteticaapi.domain.enums.ProcedureType;

import java.time.LocalDate;

public record SchedulingRequest(
        String name,
        String email,
        String phone,
        ProcedureType procedureType,
        LocalDate scheduleDateTime,
        String scheduleHours,
        String message
) {
}
