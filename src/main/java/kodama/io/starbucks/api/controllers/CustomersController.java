package kodama.io.starbucks.api.controllers;

import kodama.io.starbucks.business.abstracts.CustomerService;
import kodama.io.starbucks.business.dto.requests.CreateCustomerRequest;
import kodama.io.starbucks.business.dto.responses.CreateCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/customers")
public class CustomersController {
    private final CustomerService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse add(@RequestBody CreateCustomerRequest request) throws Exception {
        return service.add(request);
    }
}
