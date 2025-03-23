package br.com.univesp.clinicaesteticaapi.application.controller;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.BudgetResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest.BudgetRequest;
import br.com.univesp.clinicaesteticaapi.domain.service.BudgetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/budget")
public class BudgetController {

    private final BudgetService budgetService;

    @PostMapping
    public ResponseEntity<BudgetResponse> saveBudget(@RequestBody @Valid BudgetRequest budgetRequest) {
        return ResponseEntity.ok(budgetService.saveBudget(budgetRequest));
    }
}
