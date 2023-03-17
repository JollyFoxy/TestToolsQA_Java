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
public class ResponseGetSingleUser{
	@JsonProperty("data")
	private Data data ;
	@JsonProperty("support")
	private Support support;
}
