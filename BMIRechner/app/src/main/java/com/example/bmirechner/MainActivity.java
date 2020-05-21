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
    private TextView gewicht;
    private TextView größe;
    private SeekBar seekBar;
    private SeekBar seekBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gewicht = (TextView)findViewById(R.id.gewicht);
        größe = (TextView) findViewById(R.id.groese);
        ergebnis = (TextView)findViewById((R.id.ergebnis));
        los_button = (Button)findViewById(R.id.los_button);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar2 = (SeekBar)findViewById(R.id.seekBar2);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                gewicht.setText("" + progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                größe.setText("" + progress+ "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

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
        ergebnis.setText("Ihr BMI ist: " + bmishow);
    }
}
