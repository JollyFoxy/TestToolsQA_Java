package Api.Models.Responses.GetSingleUser;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data{
	@JsonProperty("last_name")
	private String lastName;
	private int id;
	private String avatar;
	@JsonProperty("first_name")
	private String firstName;
	private String email;
}
