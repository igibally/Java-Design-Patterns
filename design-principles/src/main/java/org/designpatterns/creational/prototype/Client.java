package org.designpatterns.creational.prototype;

import javafx.geometry.Point3D;

public class Client {

  public static void main (String args[]) throws CloneNotSupportedException {
    SwordsMan swordsMan = new SwordsMan();
    swordsMan.move(new Point3D(-10,0,0), 20);
    swordsMan.attack();
    System.out.println(swordsMan.toString());
    SwordsMan swordsManTwo= (SwordsMan) swordsMan.clone();
    swordsManTwo.attack();
    System.out.println(swordsManTwo.toString());
  }

}
