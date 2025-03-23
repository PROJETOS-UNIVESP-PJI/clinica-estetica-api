package br.com.univesp.clinicaesteticaapi.mapper;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.BudgetResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest.BudgetRequest;
import br.com.univesp.clinicaesteticaapi.domain.model.Budget;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BudgetMapper {

    Budget toBudget(BudgetRequest budgetRequest);

    BudgetResponse toBudgetResponse(Budget budget);

    BudgetRequest toBudgetRequest(Budget budget);

}
