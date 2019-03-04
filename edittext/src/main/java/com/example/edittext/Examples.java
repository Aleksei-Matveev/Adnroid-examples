package com.example.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Examples extends AppCompatActivity {

    EditText txtName, txtAge;
    TextView display;
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples);

        txtName = findViewById(R.id.name);
        txtAge = findViewById(R.id.age);

        display = findViewById(R.id.txtDisplay);

        btnDisplay = findViewById(R.id.btnDisplay);

        /***When click on Display Button then Name and Age will display int TextView bellow Button***/
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /***Check is Name and Age Field is Not(If Empty then show Toast else display in TextView)***/
                if(txtName.getText().toString().isEmpty() || txtAge.toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fields is not blank", Toast.LENGTH_LONG).show();
                }
                else{
                   String name = txtName.getText().toString();
                   String age = txtAge.getText().toString();

                   /***Display the name and the age in Textview***/
                   display.setText(name + "\n" + age);
                }
            }
        });
    }
}
