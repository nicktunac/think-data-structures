package com.nicktunac.chapter2_analysis;

public class SelectionSort {

  /**
   * Swaps the elements at indexes i and j
   */
  public static void swapElements(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  /**
   * Find the index of the lowest value
   * starting from the index at start (inclusive)
   * and going to the end of the array
   */
  public static int indexLowest(int[] array, int start){
    int lowIndex = start;

    for(int i = start + 1; i < array.length; i++) {
      if(array[i] < array[lowIndex]) {
        lowIndex = i;
      }
    }

    return lowIndex;
  }

  /**
   * Sorts the elements (in place) using selection sort
   */
  public static void selectionSort(int[] array) {
    for(int i = 0; i < array.length; i++ ) {
      int j = indexLowest(array, i);
      swapElements(array, i, j);
    }
  }
}
