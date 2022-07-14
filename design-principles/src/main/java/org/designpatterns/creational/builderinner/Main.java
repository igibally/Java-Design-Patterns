package org.designpatterns.creational.builderinner;

import java.time.LocalDate;
import org.designpatterns.creational.builder.Address;
import org.designpatterns.creational.builder.User;
import org.designpatterns.creational.builderinner.UserDTO.UserDTOBuilder;

public class Main {

  public static void main(String args[]){

    User user = createUser();
    UserDTOBuilder builder= UserDTO.getUserDTOBuilder();
   UserDTO userDTO = builder.
          withAddress(user.getAddress())
          .withFirstName(user.getFirstName())
          .withLastName(user.getLastName()).
           withBrithDay(user.getBirthday()).build();
   System.out.println(userDTO.toString());

  }

  public static User createUser(){
    org.designpatterns.creational.builder.User user = new User();
    user.setBirthday(LocalDate.of(1960, 5, 6));
    user.setFirstName("Ron");
    user.setLastName("Swanson");
    org.designpatterns.creational.builder.Address address = new Address();
    address.setHouseNumber("100");
    address.setStreet("State Street");
    address.setCity("Pawnee");
    address.setState("Indiana");
    address.setZipcode("47998");
    user.setAddress(address);
    return user;
  }

}
