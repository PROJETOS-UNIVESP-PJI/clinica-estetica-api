package br.com.univesp.clinicaesteticaapi.mapper;

import br.com.univesp.clinicaesteticaapi.application.controller.dto.response.SchedulingResponse;
import br.com.univesp.clinicaesteticaapi.application.controller.dto.resquest.SchedulingRequest;
import br.com.univesp.clinicaesteticaapi.domain.model.Scheduling;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SchedulingMapper {

    Scheduling toScheduling(SchedulingRequest schedulingRequest);

    SchedulingResponse toSchedulingResponse(Scheduling scheduling);

    SchedulingRequest toSchedulingRequest(Scheduling scheduling);

}
