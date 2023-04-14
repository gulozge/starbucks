package kodama.io.starbucks.business.concretes;

import kodama.io.starbucks.business.abstracts.CustomerCheckService;
import kodama.io.starbucks.entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
