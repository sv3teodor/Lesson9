package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DTOUserProfile {
    @JsonProperty("username")
    private String userName;
    @JsonProperty("password")
    private String password;
}
