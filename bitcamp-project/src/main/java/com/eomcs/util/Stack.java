package com.eomcs.util;

import java.util.Arrays;

public class Stack implements Cloneable {
  
  private static final int DEFAULT_CAPACITY = 10;
  
  Object[] elementData;
  int size;
  
  public Stack() {
    this.elementData = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }
  
  public void push(Object value) {
    if (this.size == elementData.length) {
      grow();
    }
    this.elementData[size++] = value;
  }
  
  private void grow() {
    this.elementData = Arrays.copyOf(elementData, newCapacity());
  }
  
  private int newCapacity() {
    int oldCapacity = elementData.length;
    return oldCapacity + (oldCapacity >> 1);
  }
  
  public Object pop() {
    if (this.empty())
      return null;
    Object value = this.elementData[--this.size];
    this.elementData[this.size] = null;
    return value;
  }
  
  public boolean empty() {
    return this.size == 0;
  }
  
  @Override
  public Stack clone() {
    try {
      return (Stack)super.clone();
      
    } catch (CloneNotSupportedException ex) {
      // Object의 clone() 메서드는 
      // 복제가 허용된 객체에 대해서만 해당 인스턴스 변수를 복제한다.
      // 복제가 허용되지 않은 객체에 대해서 clone()을 호출하면 
      // CloneNotSupportedException 실행 오류가 발생한다.
      // 해결책?
      // => 해당 클래스의 객체를 복제할 수 있다고 표시하라. 
      // => 방법: Cloneable 인터페이스를 지정한다.
      //    예) class My implements Cloneable {...}
      //
      System.out.println(ex);
      return null;
    }
  }
}




