package com.eomcs.util;

import java.util.Arrays;

public class ArrayList {
  
  private static final int DEFAULT_CAPACITY = 2;
  
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
  
  public void add(Object e) {
    if (this.size == this.elementData.length) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >> 1);
      
      this.elementData = Arrays.copyOf(this.elementData, newSize);
      /*
      Object[] newArr = new Object[newSize];
      for (int i = 0; i < this.size; i++) {
        newArr[i] = this.elementData[i];
      }
      this.elementData = newArr;
      */
    }
    this.elementData[this.size++] = e;
  }
  
  public Object get(int index) {
    return this.elementData[index];
  }
  
  public void set(int index, Object e) {
    this.elementData[index] = e;
  }
  
  public void remove(int index) {
    
    for (int i = index + 1; i < this.size; i++) {
      this.elementData[i - 1] = this.elementData[i];
    }
    
    this.size--;
  }
}





