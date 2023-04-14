package kodama.io.starbucks.business.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerResponse {
    private int id;
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String nationalitiyIdenditiy;
}
