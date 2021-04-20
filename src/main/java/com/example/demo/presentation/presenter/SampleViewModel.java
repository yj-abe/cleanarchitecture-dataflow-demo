package com.example.demo.presentation.presenter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

public class SampleViewModel {

  private final PublishSubject<String> valueSubject = PublishSubject.create();

  public Observable<String> subscribeValue() {
    return valueSubject;
  }

  void updateValue(String value) {
    valueSubject.onNext(value);
    valueSubject.onComplete();
  }

}
