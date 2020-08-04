package nhs90416.hal.ac.mybmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private EditText edit_height;
    private EditText edit_weight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_height = (EditText) findViewById(R.id.edit_height);
        edit_weight = (EditText) findViewById(R.id.edit_weight);

    }

    public void buttonMethod(View myButton){
        float h = Float.parseFloat(edit_height.getText().toString()) / 100.0f;
        float w = Float.parseFloat(edit_weight.getText().toString());

        float anser = w / (h * h);


//        if(bmi < 18.5f){
//            bmi_judge = getString(R.string.result_judge_0);
//        }else if (bmi < 25.0f){
//            bmi_judge = getString(R.string.result_judge_1);
//        }else {
//            bmi_judge = getString(R.string.result_judge_2);
//        }

//       value.setText(String.valueOf(bmi));
//       judge.setText(String.valueOf(bmi_judge));

       Intent result_act = new Intent(MainActivity.this, ResultActivity.class);
       result_act.putExtra("ANSER",anser);
       startActivity(result_act);
    }
}



