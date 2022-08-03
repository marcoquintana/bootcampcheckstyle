package com.nttdata.customerservice.model.repository;

import com.nttdata.customerservice.model.document.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Clase Repository Customer.
 */
@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {

}
