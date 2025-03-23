package br.com.univesp.clinicaesteticaapi.application.controller.dto.response;

import br.com.univesp.clinicaesteticaapi.domain.enums.ProcedureType;
import br.com.univesp.clinicaesteticaapi.domain.enums.ServiceType;

public record BudgetResponse(
        Long id,
        String name,
        String email,
        String phone,
        ServiceType serviceType,
        ProcedureType procedureType,
        String message
) {
}
