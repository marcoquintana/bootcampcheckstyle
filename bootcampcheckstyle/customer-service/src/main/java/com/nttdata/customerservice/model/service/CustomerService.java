package com.nttdata.customerservice.model.service;

import com.nttdata.customerservice.model.document.Company;
import com.nttdata.customerservice.model.document.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Interface Customer Service.
 */
public interface CustomerService {

  Flux<Customer> getAll();

  Mono<Customer> save(Customer customer);

  Mono<Customer> findById(String id);

  Mono<Boolean> existsById(String id);

  Mono<Void> delete(Customer customer);

  Flux<Company> getAllCompany();

  Mono<Company> findCompanyById(String id);

  Mono<Company> saveCompany(Company company);

}
