package org.example.openclosed;


// closed for modification
public abstract class Subscriber {

  private Long subscriberId;
  private String address;
  private Long phoneNumber;
  private int baseRate;

  public Long getSubscriberId() {
    return subscriberId;
  }

  public void setSubscriberId(Long subscriberId) {
    this.subscriberId = subscriberId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getBaseRate() {
    return baseRate;
  }

  public void setBaseRate(int baseRate) {
    this.baseRate = baseRate;
  }
  public  abstract void calcualteBill();
}
