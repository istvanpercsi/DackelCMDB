package de.percsi.products.dackelcmdb.model;

import de.percsi.products.dackelcmdb.model.literal.Number;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValueOfPropertyOfEntityTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void getValue() {
    ValueOfPropertyOfEntity<Number> valueOfPropertyOfEntity = new ValueOfPropertyOfEntity<>(new Number());
    assertTrue(valueOfPropertyOfEntity.getValue() instanceof Number);

  }
}