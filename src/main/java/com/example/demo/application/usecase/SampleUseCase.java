package com.example.demo.application.usecase;

import com.example.demo.application.port.input.SampleInputData;
import com.example.demo.application.port.input.SampleInputPort;
import com.example.demo.application.port.output.SampleOutputData;
import com.example.demo.application.port.output.SampleOutputPort;

public class SampleUseCase implements SampleInputPort {

  private final SampleOutputPort outputPort;

  public SampleUseCase(SampleOutputPort outputPort) {
    this.outputPort = outputPort;
  }

  @Override
  public void input(SampleInputData data) {
    String upperCaseValue = data.getValue().toUpperCase();
    SampleOutputData outputData = new SampleOutputData(upperCaseValue);
    outputPort.output(outputData);
  }

}
