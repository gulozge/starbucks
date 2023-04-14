package kodama.io.starbucks.repository;

import kodama.io.starbucks.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    boolean existsByNationalitiyIdenditiy(String  nationalitiyIdenditiy);
}
