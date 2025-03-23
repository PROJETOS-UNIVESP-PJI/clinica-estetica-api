package br.com.univesp.clinicaesteticaapi.domain.service;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.BudgetResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest.BudgetRequest;
import br.com.univesp.clinicaesteticaapi.domain.model.Budget;
import br.com.univesp.clinicaesteticaapi.infrastructure.repository.BudgetRepository;
import br.com.univesp.clinicaesteticaapi.mapper.BudgetMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;
    private final BudgetMapper budgetMapper;

    public BudgetResponse saveBudget(BudgetRequest budgetRequest) {
        Budget budget = budgetMapper.toBudget(budgetRequest);
        budget = budgetRepository.save(budget);
        return budgetMapper.toBudgetResponse(budget);
    }
}
