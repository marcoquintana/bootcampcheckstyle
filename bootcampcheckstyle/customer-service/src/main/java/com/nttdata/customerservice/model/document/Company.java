package com.nttdata.customerservice.model.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase Company document.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "companys")
public class Company {

  @Id
  private String id;
  private String ruc;
  private String name;
  private String address;
}
