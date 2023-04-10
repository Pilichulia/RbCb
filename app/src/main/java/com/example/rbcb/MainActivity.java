package com.example.rbcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbsir, cbkar;
    private int price = 0;
    private String itog = "";
    private TextView tvItog;
    //dsdffd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        cbkar = findViewById(R.id.checkBoxKar);
        cbsir = findViewById(R.id.checkBoxSir);
        tvItog = findViewById(R.id.TextViewItog);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButtonCap:
                        itog = "Капучино";
                        price = 80;
                        checkTop(getCurrentFocus());
                        tvItog.setText(itog);
                        tvItog.append(" " + price + " руб.");
                        break;
                    case R.id.radioButtonLat:
                        itog = "Латте";
                        price = 60;
                        checkTop(getCurrentFocus());
                        tvItog.setText(itog);
                        tvItog.append(" " + price + " руб.");
                        break;
                }
            }
        });
    }

    public void checkTop(View view){
        if(cbkar.isChecked()) {
            price += 20;
            tvItog.append(" " + price + " руб.");
        }
        if(cbsir.isChecked()) {
            price += 30;
            tvItog.append(" " + price + " руб.");
        }
    }
}