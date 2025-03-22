package br.com.univesp.clinicaesteticaapi.domain.model;

import br.com.univesp.clinicaesteticaapi.domain.enums.ProcedureType;
import br.com.univesp.clinicaesteticaapi.domain.enums.ServiceType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "scheduling")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Scheduling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome não pode estar em branco.")
    private String name;
    @NotBlank(message = "O e-mail não pode estar em branco.")
    @Email(message = "O e-mail recebido não é válido.")
    private String email;
    @NotBlank(message = "O número de telefone não pode estar em branco.")
    private String phone;
    private ServiceType serviceType;
    private ProcedureType procedureType;
    @NotNull(message = "A data não pode ser nula.")
    private LocalDate scheduleDateTime;
    @NotBlank(message = "A hora não pode ser vazia.")
    private String scheduleHours;
    private String message;

    @PrePersist
    public void prePersist() {
        serviceType = ServiceType.SCHEDULED;
    }
}
