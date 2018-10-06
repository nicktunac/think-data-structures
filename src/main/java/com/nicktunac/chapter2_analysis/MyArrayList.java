package com.nicktunac.chapter2_analysis;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {

  int size;
  private E[] array;

  public MyArrayList() {
    array = (E[]) new Object[10];
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(E e) {
    if(size >= array.length) {
      // make a bigger array and copy over the elements
      E[] bigger = (E[]) new Object[array.length * 2];
      System.arraycopy(array, 0, bigger, 0, array.length);
      array = bigger;
    }

    array[size] = e;
    size++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public E get(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    return array[index];
  }

  @Override
  public E set(int index, E element) {
    rangeCheck(index);
    E oldValue = array[index];
    array[index] = element;
    return oldValue;
  }

  private void rangeCheck(int index) {
    if(index >= size) {
      throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
  }

  @Override
  public void add(int index, E element) {

  }

  private String outOfBoundsMsg(int index) {
    return "Index: " + index + ", Size: " +  size;
  }

  @Override
  public E remove(int index) {
    rangeCheck(index);

    E oldValue = elementData(index);
    int numMoved = size - index - 1;
    if(numMoved > 0)
      System.arraycopy(array, index+1, array, index,
          numMoved);

    array[--size] = null;

    return oldValue;
  }

  public E elementData(int index) {
    return array[index];
  }

  @Override
  public int indexOf(Object o) {
    if(o == null) {
      for(int i = 0; i < size; i++) {
        if(array[i] == null) {
          return i;
        }
      }
    } else {

      for(int i = 0; i< size; i++) {
        if(o.equals(array[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<E> listIterator() {
    return null;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }
}
