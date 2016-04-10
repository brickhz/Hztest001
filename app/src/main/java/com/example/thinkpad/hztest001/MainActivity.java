package com.example.thinkpad.hztest001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private Button button = null;
    private boolean ledon =false;
    private CheckBox checkBoxLED1 = null;
    private CheckBox checkBoxLED2 = null;
    private CheckBox checkBoxLED3 = null;
    private CheckBox checkBoxLED4 = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.BUTTON);
        checkBoxLED1 = (CheckBox) findViewById(R.id.LED1);
        checkBoxLED2 = (CheckBox) findViewById(R.id.LED2);
        checkBoxLED3 = (CheckBox) findViewById(R.id.LED3);
        checkBoxLED4 = (CheckBox) findViewById(R.id.LED4);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ledon = !ledon;
                if(ledon) {
                    button.setText("ALL OFF");
                    checkBoxLED1.setChecked(true);
                    checkBoxLED2.setChecked(true);
                    checkBoxLED3.setChecked(true);
                    checkBoxLED4.setChecked(true);

                }
                    else {
                    button.setText("ALL ON");
                    checkBoxLED1.setChecked(false);
                    checkBoxLED2.setChecked(false);
                    checkBoxLED3.setChecked(false);
                    checkBoxLED4.setChecked(false);
                }
                //11111orm action on click
            }
        });


    }
}
