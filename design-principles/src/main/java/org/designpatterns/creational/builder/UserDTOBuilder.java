package org.designpatterns.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    // methods to build "parts" of product at a time
      UserDTOBuilder withFirstName(String fname);
      UserDTOBuilder withLastName(String lname);
      UserDTOBuilder withBirthday(LocalDate date);
      UserDTOBuilder withAddress(Address address);
      UserDTO build();
      UserDTO getUserDTO();


}
