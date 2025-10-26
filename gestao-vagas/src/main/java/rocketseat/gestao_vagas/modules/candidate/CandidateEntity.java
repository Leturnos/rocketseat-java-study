package rocketseat.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data; // Getter e setter para todos
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "O campo username não deve conter espaços")
    private String username;

    @Email(message = "Email deve ser válido")
    private String email;

    @Length(min = 8, max = 100)
    private String password;
    private String description;
    private String curriculum;
}


