package com.example.user.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioSexGroup=(RadioGroup)findViewById(R.id.radioGroup);

        btnDisplay=(Button)findViewById(R.id.button);
//OK CLICK
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //USE TO GET THE ID OF THE SELECTED ITEM
                int selectedId=radioSexGroup.getCheckedRadioButtonId();

                radioSexButton=(RadioButton)findViewById(selectedId);
                Toast.makeText(MainActivity.this,radioSexButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}


