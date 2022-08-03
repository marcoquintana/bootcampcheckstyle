package com.nttdata.customerservice.model.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase Customer Document.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customers")
public class Customer {

  @Id
  private String id;
  private String customerType;
  private String documentType;
  private String documentNumber;
  private String name;
  private String address;
  private String email;
  private String phone;
  private Company company;
}
