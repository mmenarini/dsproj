package com.example.getty;

import junit.framework.TestCase;

public class InterpolationSearchTest extends TestCase {
  private InterpolationSearch search;

  public void setUp() {
    search = new InterpolationSearch();
  }

  public void testInterpolationSearch() {
    int[] arr = {0, 1, 2, 3, 4, 5};
    int index = search.interpolationSearch(arr, 2);
    assertTrue(index == 2);

    index = search.interpolationSearch(arr, 5);
    assertTrue(index == 5);

    index = search.interpolationSearch(arr, -1);
    assertTrue(index == -1);

    index = search.interpolationSearch(arr, 8);
    assertTrue(index == -1);
  }
}
