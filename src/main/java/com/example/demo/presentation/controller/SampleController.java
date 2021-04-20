package com.example.demo.presentation.controller;

import com.example.demo.application.port.input.SampleInputData;
import com.example.demo.application.port.input.SampleInputPort;

public class SampleController {

  private final SampleInputPort inputPort;

  public SampleController(SampleInputPort inputPort) {
    this.inputPort = inputPort;
  }

  public void inputValue(String value) {
    inputPort.input(new SampleInputData(value));
  }

}
