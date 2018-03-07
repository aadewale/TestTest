package com.example.android.testtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton question1Option1,question2Option3;
    Button submit;
    int score;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    CheckBox question3Option1, question3Option2, question3Option3, question3Option4, question4Option1, question4Option2, question4Option3, question4Option4;
    String answerQQ5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question1Option1 = (RadioButton) findViewById(R.id.question1Option1);
        question2Option3 = (RadioButton) findViewById(R.id.question2Option3);
        question3Option1 = (CheckBox) findViewById(R.id.question3Option1);
        question3Option2 = (CheckBox) findViewById(R.id.question3Option2);
        question3Option3 = (CheckBox) findViewById(R.id.question3Option3);
        question3Option4 = (CheckBox) findViewById(R.id.question3Option4);
        question4Option1 = (CheckBox) findViewById(R.id.question4Option1);
        question4Option2 = (CheckBox) findViewById(R.id.question4Option2);
        question4Option3 = (CheckBox) findViewById(R.id.question4Option3);
        question4Option4 = (CheckBox) findViewById(R.id.question4Option4);
        EditText countryName = (EditText) findViewById(R.id.ibere);
        answerQQ5 = countryName.getText().toString();
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (question1Option1.isChecked()) {

                    score +=2;
                }
                if (question2Option3.isChecked()) {

                    score +=2;
                }
                if (question3Option3.isChecked()) {

                    score++;
                }
                if (question3Option4.isChecked()) {

                    score++;
                }
                if (question4Option1.isChecked()) {

                    score++;
                }
                if (question4Option2.isChecked()) {

                    score++;
                }
               /* if (answerQQ5 == "Nigeria") {

                    score +=2;
                }*/
                radioGroup1.clearCheck();
                radioGroup2.clearCheck();
                question3Option1.setChecked(false);
                question3Option2.setChecked(false);
                question3Option3.setChecked(false);
                question3Option4.setChecked(false);
                question4Option1.setChecked(false);
                question4Option2.setChecked(false);
                question4Option3.setChecked(false);
                question4Option4.setChecked(false);





               Toast.makeText(getApplicationContext(), "You scored " + score + " marks" + answerQQ5, Toast.LENGTH_LONG).show(); // print the value of selected super star
                score = 0;
            }


        });


        }
    }



