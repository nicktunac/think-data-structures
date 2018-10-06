package com.nicktunac.chapter2_analysis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

  List<String> arrayList;

  @Before
  public void before() {
    arrayList = new MyArrayList<>();
  }

  @Test
  public void testMyArrayList() {
    for (int i = 0; i < 15; i++) {
      arrayList.add(i + " ");
    }

    assertTrue(arrayList.size() == 15);
  }

  @Test
  public void testOutOfBounds() {
    try {
      arrayList.get(10000);
    } catch(IndexOutOfBoundsException e) {
      assertTrue("This test will throw index out of bounds exception", true);
    }
  }

  @Test
  public void testSetArrayList() {

    final String helloWorld = "Hello World!";

    arrayList.add(helloWorld);
    String oldValue = arrayList.set(0, "New World!");

    assertTrue(oldValue.equals(helloWorld));

  }

  @Test
  public void testIndexOf() {

    final String firstString = "1 string";
    final String secondString = "2 string";
    final String thirdString = "3 string";

    arrayList.add(firstString);
    arrayList.add(secondString);
    arrayList.add(thirdString);

    assertEquals(0, arrayList.indexOf(firstString));
    assertEquals(1, arrayList.indexOf(secondString));
    assertEquals(2, arrayList.indexOf(thirdString));
    assertEquals(-1, arrayList.indexOf("Not Valid String"));
    assertEquals(-1, arrayList.indexOf(null));

  }

}
