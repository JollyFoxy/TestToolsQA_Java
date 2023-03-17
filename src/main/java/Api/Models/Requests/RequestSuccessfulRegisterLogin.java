package Api.Models.Requests;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestSuccessfulRegisterLogin {
    private String email;
    private String password;
}
