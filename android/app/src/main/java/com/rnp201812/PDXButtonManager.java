package com.rnp201812;
import android.widget.Button;
import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class PDXButtonManager extends SimpleViewManager<Button> implements View.OnClickListener {

    @Override
    public String getName() {
        return "PDXButton";
    }

    @Override
    protected Button createViewInstance(ThemedReactContext reactContext) {
        Button button = new Button(reactContext);
        button.setText("React Native Portland");
        button.setOnClickListener(this);
        return button;
    }

    @Override
    public void onClick(View view) {
      Button button = (Button) view;
      button.setText("Clicked!");
    }

}
