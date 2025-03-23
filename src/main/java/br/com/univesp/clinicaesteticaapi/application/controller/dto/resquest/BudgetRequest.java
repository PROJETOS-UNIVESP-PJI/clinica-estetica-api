package br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest;

import br.com.univesp.clinicaesteticaapi.domain.enums.ProcedureType;

public record BudgetRequest (
        String name,
        String email,
        String phone,
        ProcedureType procedureType,
        String message
) {
}
