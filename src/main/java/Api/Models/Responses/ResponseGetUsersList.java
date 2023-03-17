package Api.Models.Responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseGetUsersList {

    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("name")
    private String name = firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String avatar;
    private String email;
}
