package org.designpatterns.creational.builderinner;

import java.time.LocalDate;
import java.time.Period;
import org.designpatterns.creational.builder.Address;

public class UserDTO {

  private String name;
  private String  address;
  private String age;

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  private void setAddress(String address) {
    this.address = address;
  }

  public String getAge() {
    return age;
  }

  private void setAge(String age) {
    this.age = age;
  }
  public static UserDTOBuilder getUserDTOBuilder(){
    return  new UserDTOBuilder();
  }

  @Override
  public String toString() {
    return "UserDTO{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", age='" + age + '\'' +
        '}';
  }

  // builder
  public  static class UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDTO userDTO;

   public UserDTOBuilder withFirstName(String firstName){
      this.firstName=firstName;
      return this;
    }

    public UserDTOBuilder withLastName(String lastName){
      this.lastName=lastName;
      return this;
    }
    public  UserDTOBuilder withBrithDay(LocalDate date){
        age= Integer.toString(Period.between(date,LocalDate.now()).getYears());
        return this;
    }
    public  UserDTOBuilder withAddress(Address address){
     this.address= address.getHouseNumber()+ "\n"+ address.getStreet() + "\n"+
         address.getCity()+", "+ address.getState()+" " +address.getZipcode();
     return this;
    }
    public UserDTO build(){
     this.userDTO= new UserDTO();
      userDTO.setAddress(address);
      userDTO.setName(firstName + " "+ lastName);
      userDTO.setAge(age);
      return this.userDTO;
    }

    public UserDTO getUserDTO(){
      return this.userDTO;
    }
  }
}
