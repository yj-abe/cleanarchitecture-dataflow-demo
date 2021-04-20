package com.example.demo.presentation.presenter;

import com.example.demo.application.port.output.SampleOutputData;
import com.example.demo.application.port.output.SampleOutputPort;

public class SamplePresenter implements SampleOutputPort {

  private final SampleViewModel viewModel;

  public SamplePresenter(SampleViewModel viewModel) {
    this.viewModel = viewModel;
  }

  @Override
  public void output(SampleOutputData data) {
    viewModel.updateValue("##" + data.getValue() + "##");
  }

}
