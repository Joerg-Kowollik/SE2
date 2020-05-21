package com.example.bmirechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button los_button;
    private TextView ergebnis;
    private EditText gewicht;
    private EditText größe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gewicht = (EditText)findViewById(R.id.gewicht);
        größe = (EditText)findViewById(R.id.groese);
        ergebnis = (TextView)findViewById((R.id.ergebnis));


    }

    public void calculateBMI(View view) {

        String gewi = gewicht.getText().toString();
        String grö = größe.getText().toString();

        float gew = Float.parseFloat (gewi);
        float gro = Float.parseFloat (grö);
        float bmi = gew /((gro/100)* (gro/100));

        displayBMI(bmi);
    }

    private void displayBMI(float bmi) {
        String bmishow = "";
        bmishow = bmi +"";
        ergebnis.setText(bmishow);
    }
}
