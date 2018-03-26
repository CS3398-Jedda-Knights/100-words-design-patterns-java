package com.hundredwordsgof.flyweight;

/**
 * 
 * jh2012: John Halliday
 *
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
