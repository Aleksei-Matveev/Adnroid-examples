package by.matveev.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Example extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        
        txt1 = (TextView) findViewById(R.id.TextView1);
        txt2 = (TextView) findViewById(R.id.TextView2);
        txt3 = (TextView) findViewById(R.id.TextView3);
        txt4 = (TextView) findViewById(R.id.TextView4);

    }
}
