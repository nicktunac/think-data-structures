package com.nicktunac.chapter1_interfaces;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ListClientExampleTest {

  @Test
  public void testListClientExample() {

    ListClientExample listClientExample = new ListClientExample();
    List list  = listClientExample.getList();

    assertTrue(list instanceof LinkedList);
  }

}
