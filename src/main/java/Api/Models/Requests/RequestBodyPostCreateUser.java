package Api.Models.Requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyPostCreateUser {
    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
}
