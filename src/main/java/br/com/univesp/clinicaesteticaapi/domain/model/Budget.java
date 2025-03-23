package br.com.univesp.clinicaesteticaapi.domain.model;

import br.com.univesp.clinicaesteticaapi.domain.enums.ProcedureType;
import br.com.univesp.clinicaesteticaapi.domain.enums.ServiceType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "budget")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Budget {
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
    private String message;

    @PrePersist
    public void prePersist() {
        serviceType = ServiceType.BUDGET;
    }
}
