package com.rnp201812;
import android.widget.Button;
import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class PDXButtonManager extends SimpleViewManager<Button> implements View.OnClickListener {

    public static final String REACT_CLASS = "PDXButton";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected Button createViewInstance(ThemedReactContext reactContext) {
        Button button = new Button(reactContext);
        button.setText("Jamon");
        button.setOnClickListener(this);
        return button;
    }

    public void onClick(View v) {
        Button button = (Button) v;
        button.setText("Pressed");
    }
}
