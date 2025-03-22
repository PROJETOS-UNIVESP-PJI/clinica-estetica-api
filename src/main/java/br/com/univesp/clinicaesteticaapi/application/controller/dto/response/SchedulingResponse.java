package br.com.univesp.clinicaesteticaapi.application.controller.dto.response;

import br.com.univesp.clinicaesteticaapi.domain.enums.ProcedureType;
import br.com.univesp.clinicaesteticaapi.domain.enums.ServiceType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record SchedulingResponse(
        Long id,
        String name,
        String email,
        String phone,
        ServiceType serviceType,
        ProcedureType procedureType,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
        LocalDate scheduleDateTime,
        String scheduleHours,
        String message
) {
}
