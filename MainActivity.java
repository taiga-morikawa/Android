package nhs90502.hal.ac.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private TextView aTextView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aTextView = (TextView)findViewById(R.id.myTextView);
        aTextView.setText("Push myButton!");
        count = 1;

    }

    public void buttonMethod(View myButton)
    {
        aTextView.setText(String.format("Pushed %d times",count++));

    }
}
