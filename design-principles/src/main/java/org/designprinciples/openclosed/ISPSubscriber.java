package org.designprinciples.openclosed;

public class ISPSubscriber extends Subscriber {

  @Override
  public void calcualteBill() {
    // i'm ISP  subscriber and im calcualting a bill
     System.out.println("i'm ISP Subscriber and im calcualating a bill");
  }
}
