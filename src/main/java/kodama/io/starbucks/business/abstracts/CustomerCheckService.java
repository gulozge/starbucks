package kodama.io.starbucks.business.abstracts;

import kodama.io.starbucks.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}
