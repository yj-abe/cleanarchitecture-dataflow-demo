package com.example.demo.infrastructure.framework.spring.controller;

import com.example.demo.application.port.input.SampleInputPort;
import com.example.demo.application.port.output.SampleOutputPort;
import com.example.demo.application.usecase.SampleUseCase;
import com.example.demo.presentation.controller.SampleController;
import com.example.demo.presentation.presenter.SamplePresenter;
import com.example.demo.presentation.presenter.SampleViewModel;
import io.reactivex.rxjava3.disposables.Disposable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestController {

  @GetMapping
  public String sample() {
    SampleViewModel viewModel = new SampleViewModel();
    SampleOutputPort outputPort = new SamplePresenter(viewModel);
    SampleInputPort inputPort = new SampleUseCase(outputPort);
    SampleController controller = new SampleController(inputPort);

    ValueCaptor<String> captor = new ValueCaptor<>();
    Disposable subscribe = viewModel.subscribeValue()
        .doOnNext(captor::capture)
        .subscribe();

    controller.inputValue("chief takano officer");
    subscribe.dispose();

    return captor.getValue();
  }

}
