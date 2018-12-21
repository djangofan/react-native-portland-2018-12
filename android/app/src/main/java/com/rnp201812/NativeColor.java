package com.rnp201812;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

import java.util.Map;
import java.util.HashMap;

public class NativeColor extends ReactContextBaseJavaModule {

  @Override
  public String getName() {
    return "NativeColor";
  }

  public NativeColor(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  public void bgColor(final Promise promise) {
    promise.resolve("#0000FF");
  }
}
