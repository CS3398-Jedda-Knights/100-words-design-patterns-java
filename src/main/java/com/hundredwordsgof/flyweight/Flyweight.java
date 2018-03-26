package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
// This is an edit from Kentessa's branch.
public interface Flyweight {

  void operation(Object extrinsicState);
}
