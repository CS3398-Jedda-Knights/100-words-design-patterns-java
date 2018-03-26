package com.hundredwordsgof.flyweight;
/**
 Juan has edited this file and completed the Travis CI confirmation for the flyweight pattern.
*/
/**
 * 
 * ConcreteFlyweight,implements Flyweight, and add storage for intrisnic state.
 *
 */
public class ConcreteFlyweight implements Flyweight {

  private Object intrinsicState;

  public ConcreteFlyweight(Object intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  // Using extrinsicState as context and does NOT modify intrinsic state.
  public void operation(Object extrinsicState) {
  }

  /**
   * @return intrinsic state
   */
  public Object getIntrinsicState() {
    return intrinsicState;
  }
}
