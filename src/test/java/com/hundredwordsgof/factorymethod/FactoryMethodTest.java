package com.hundredwordsgof.factorymethod;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 * Test implementation of the FactoryMethod pattern.
 */
public class FactoryMethodTest {

  @Test
  public void testFactoryMethod() {

    Creator factory = new ConcreteCreator();

    Product productA = factory.factoryMethod("A");
    Product productB = factory.factoryMethod("B");
    Product productC = factory.factoryMethod("A");

    assertEquals("com.hundredwordsgof.factorymethod.ConcreteProductA",
        productA.getClass().getName());
    assertEquals("com.hundredwordsgof.factorymethod.ConcreteProductB",
        productB.getClass().getName());
    assertEquals("com.hundredwordsgof.factorymethod.ConcreteProductA",
        productC.getClass().getName());
    assertNotEquals("com.hundredwordsgof.factorymethod.ConcreteProductA",
        productC.getClass().getName());
    assertEquals(productA, productC); //WOnder if this compares objects
    
    assertEquals(null, factory.factoryMethod(""));
  }
}
