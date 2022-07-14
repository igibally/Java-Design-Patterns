package org.designpatterns.creational.prototype;

public class General extends GameUnit {

  @Override
  protected void reset() {
    throw new UnsupportedOperationException("Reset not supported");
  }

  @Override
  protected GameUnit clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Ganerals are unique");
  }
}
