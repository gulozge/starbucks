package kodama.io.starbucks.business.abstracts;

import kodama.io.starbucks.business.dto.requests.CreateCustomerRequest;
import kodama.io.starbucks.business.dto.responses.CreateCustomerResponse;
import org.springframework.stereotype.Service;


public interface CustomerService {
    public CreateCustomerResponse add(CreateCustomerRequest request) throws Exception;
}
