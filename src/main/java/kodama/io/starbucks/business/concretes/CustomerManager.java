package kodama.io.starbucks.business.concretes;

import kodama.io.starbucks.adapters.MernisServiceAdapter;
import kodama.io.starbucks.business.abstracts.CustomerService;
import kodama.io.starbucks.business.dto.requests.CreateCustomerRequest;
import kodama.io.starbucks.business.dto.responses.CreateCustomerResponse;
import kodama.io.starbucks.entities.Customer;
import kodama.io.starbucks.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;
    private final MernisServiceAdapter mernisServiceAdapter;


    @Override
    public CreateCustomerResponse add(CreateCustomerRequest request) throws Exception {
        //sorgula doğruysa
        Customer customer=mapper.map(request,Customer.class);
        checkIfRealPerson(customer);
        alreadyIsCustomer(customer.getNationalitiyIdenditiy());
        customer.setId(0);
        repository.save(customer);
        CreateCustomerResponse response=mapper.map(customer,CreateCustomerResponse.class);
        return response;
    }

    private void checkIfRealPerson(Customer customer) throws Exception {
        if (!mernisServiceAdapter.checkIfRealPerson(customer)){
            throw new RuntimeException("böyle bir kişi yok hata");
        }
    }
    private void alreadyIsCustomer(String  nationalitiyIdenditiy){
        if(repository.existsByNationalitiyIdenditiy(nationalitiyIdenditiy)){
            throw new RuntimeException("kullanıcı zaten kayıtlı");
        }
    }
}
