package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveNewCustomer(CustomerDto customerDto);
    void updateCustomer(UUID beerId, CustomerDto customerDto);
    void deleteById(UUID beerId);
}
