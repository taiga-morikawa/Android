package nhs90416.hal.ac.mycheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.CheckBox;

public class MainActivity extends Activity {

private TextView aTextView;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aTextView = (TextView)findViewById(R.id.myTextView);
    }

public void checkMethod(View myCheckBox){
    CheckBox aCheckBox = (CheckBox)myCheckBox;
    String s = (String)aCheckBox.getText();
    if(aCheckBox.isChecked())
    aTextView.setText(String.format("%s Checkde", s));
    else
    aTextView.setText(String.format("%s UnChecked", s));
}
}