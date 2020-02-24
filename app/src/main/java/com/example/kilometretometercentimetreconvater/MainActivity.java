package com.example.kilometretometercentimetreconvater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button calculateBtn;
    private TextView me,cm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.e1);
        radioGroup = findViewById(R.id.radioGrId);
        calculateBtn = findViewById(R.id.con);
        me = findViewById(R.id.t1);
        cm = findViewById(R.id.t2);



        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selected = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selected);

                    double num = Double.parseDouble(editText.getText().toString());

                if (radioButton.getId()==R.id.m){
                    String meter = String.valueOf(num*1000);
                    Toast.makeText(MainActivity.this, meter+"", Toast.LENGTH_SHORT).show();
                    me.setText(meter);
                }if (radioButton.getId()==R.id.ce){
                    String centimeter = String.valueOf(num*100000);
                    Toast.makeText(MainActivity.this, centimeter+"", Toast.LENGTH_SHORT).show();
                    cm.setText(centimeter);
                }
            }
        });
    }
}
