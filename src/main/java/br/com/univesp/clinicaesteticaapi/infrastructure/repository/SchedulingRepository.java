package br.com.univesp.clinicaesteticaapi.infrastructure.repository;

import br.com.univesp.clinicaesteticaapi.domain.model.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
}
