package kodama.io.starbucks.adapters;

import kodama.io.starbucks.business.abstracts.CustomerCheckService;
import kodama.io.starbucks.configuration.mernis.VFQKPSPublicSoap;
import kodama.io.starbucks.entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        VFQKPSPublicSoap vfqkpsPublicSoap = new VFQKPSPublicSoap();
       return vfqkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalitiyIdenditiy()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());

    }

}
