package com.example.demo.infrastructure.framework.spring.controller;

public class ValueCaptor<T> {

  private T value;

  public void capture(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

}
