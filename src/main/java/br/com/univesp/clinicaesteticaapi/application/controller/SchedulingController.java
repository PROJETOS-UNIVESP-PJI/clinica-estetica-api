package br.com.univesp.clinicaesteticaapi.application.controller;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingHoursResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest.SchedulingRequest;
import br.com.univesp.clinicaesteticaapi.domain.service.SchedulingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/scheduling")
public class SchedulingController {

    private final SchedulingService schedulingService;

    @PostMapping
    public ResponseEntity<SchedulingResponse> saveScheduling(@RequestBody @Valid SchedulingRequest schedulingRequest) {
        return ResponseEntity.ok(schedulingService.saveScheduling(schedulingRequest));
    }

    @GetMapping("/hours/{scheduleDateTime}")
    public ResponseEntity<List<SchedulingHoursResponse>> getScheduleHoursByDate(@PathVariable LocalDate scheduleDateTime) {
        return ResponseEntity.ok(schedulingService.getScheduleHoursByDate(scheduleDateTime));
    }

}
