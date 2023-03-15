package Api.Users;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("name")
    private String name = firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String avatar;
    private String email;
    private String job;
}
