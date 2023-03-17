package Api.Models.Requests;

import groovy.lang.GString;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestSuccessfulRegister{
    private String email;
    private String password;
}
