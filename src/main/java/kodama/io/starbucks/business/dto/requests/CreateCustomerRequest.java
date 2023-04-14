package kodama.io.starbucks.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerRequest {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String nationalitiyIdenditiy;
}
