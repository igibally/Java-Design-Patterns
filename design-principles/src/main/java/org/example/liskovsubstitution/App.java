package org.example.liskovsubstitution;

public class App {

  public static void main (String args[]){

    Rectangle rectangle = new Rectangle(10,20);
    useRectangle(rectangle);
    Square square = new  Square(10);
    System.out.println(square.computeArea());
  }
  private static void useRectangle(Rectangle rectangle){
    rectangle.setHeight(20);
    rectangle.setHeight(30);
    boolean value = rectangle.getWidth()==30 | rectangle.getHeight() == 20;
    System.out.println(value);
  }

}
