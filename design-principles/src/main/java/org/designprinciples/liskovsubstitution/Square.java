package org.designprinciples.liskovsubstitution;

public class Square implements Shape {

  private int side;

  public Square() {
  }

  public Square(int side) {
    this.side = side;
  }

  public int getSide() {
    return side;
  }



  public void setSide(int side) {
    this.side = side;
  }


  @Override
  public int computeArea() {
    return side * side;
  }

}