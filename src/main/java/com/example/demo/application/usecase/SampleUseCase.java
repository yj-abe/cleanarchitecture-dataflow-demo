package com.example.demo.application.usecase;

import com.example.demo.application.port.input.SampleInputPort;
import com.example.demo.application.port.output.SampleOutputPort;

public class SampleUseCase implements SampleInputPort {

  private final SampleOutputPort outputPort;

  public SampleUseCase(SampleOutputPort outputPort) {
    this.outputPort = outputPort;
  }

  @Override
  public void input(String value) {
    outputPort.output(value.toUpperCase());
  }

}
