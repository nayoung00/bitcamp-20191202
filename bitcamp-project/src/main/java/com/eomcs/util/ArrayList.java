package com.eomcs.util;

public class ArrayList {
  
  private static final int DEFAULT_CAPACITY = 10;
  
  Object[] elementData;
  int size;
  
  public ArrayList() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }
  
  public ArrayList(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      this.elementData = new Object[DEFAULT_CAPACITY];
    } else {
      this.elementData = new Object[initialCapacity];
    }
  }
}





