package com.example.sunman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IndexHesaplama extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_hesaplama);

        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculateBMI (View view){
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr) && weightStr != null && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);
            displayBMI(bmi);
        }
    }

    private  void displayBMI(float bmi){

        String bmiLabel = "";

        if (Float.compare(bmi, 40f) <= 0) {
            bmiLabel = getString(R.string.very_severely_underweihgt);
        } else if (Float.compare(bmi,40f) > 1 && Float.compare(bmi,50f) <=0){
            bmiLabel = getString(R.string.severely_underweight);
        } else if (Float.compare(bmi,50f) >0 && Float.compare(bmi,58.5f) <=0){
            bmiLabel = getString(R.string.underweight);
        } else if (Float.compare(bmi,58.5f) >0 && Float.compare(bmi,75f) <=0) {
            bmiLabel = getString(R.string.normal);
        } else if (Float.compare(bmi,75f) >0 && Float.compare(bmi,90f) <=0) {
            bmiLabel = getString(R.string.overweight);
        } else if (Float.compare(bmi,90f) >0 && Float.compare(bmi,115f) <=0) {
            bmiLabel = getString(R.string.obese_class_one);
        } else if (Float.compare(bmi,115f) >0 && Float.compare(bmi,130f) <=0) {
            bmiLabel = getString(R.string.obese_class_two);
        } else {
            bmiLabel = getString(R.string.obese_class_three);
        }

        bmiLabel = bmi + "\n\n" + bmiLabel;
        result.setText(bmiLabel);
    }
}
