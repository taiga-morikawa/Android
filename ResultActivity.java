package nhs90416.hal.ac.mybmi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {

    private TextView result_value;
    private TextView result_judge;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

       result_value = (TextView)findViewById(R.id.result_value);
       result_judge = (TextView)findViewById(R.id.result_judge);

       Bundle extras = getIntent().getExtras();
           if(extras != null){
               float anser = extras.getFloat("ANSER");

               result_value.setText(String.valueOf(anser));

           String judge = null;

               if(anser < 18.5f){
          judge = getString(R.string.result_judge_0);
        }else if (anser < 25.0f){
            judge = getString(R.string.result_judge_1);
        }else {
            judge = getString(R.string.result_judge_2);
        }

      result_judge.setText(judge);


           }
    }

    public void buttonMethod(View myButton){
        finish();
    }
}



