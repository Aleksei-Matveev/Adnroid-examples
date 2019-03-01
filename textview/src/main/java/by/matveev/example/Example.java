package by.matveev.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


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

        /***To make the TextView Selectable to copy the text on TextView by long click on TextView***/
        txt1.setTextIsSelectable(true);
        txt2.setTextIsSelectable(true);
        txt3.setTextIsSelectable(true);
        txt4.setTextIsSelectable(true);

        /***Set text in TextView Programmatically***/
        txt1.setText("This is text set in TextView Programmatically");

        /***Set the Visibility of TextView
         * [View.GONE = Not Visible]
         * [View.VISIBLE = Visible***/

        txt1.setVisibility(View.GONE);
        txt1.setVisibility(View.VISIBLE);

        /***Set Background color of TextView Programmatically***/
        txt2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));

        /***Onclick Listener will fire when click on any TextView***/
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setVisibility(View.GONE);
                Toast.makeText(Example.this, "TextView1", Toast.LENGTH_SHORT).show();
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Example.this, "TextView2", Toast.LENGTH_SHORT).show();
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Example.this, "TextView3", Toast.LENGTH_SHORT).show();
            }
        });
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Example.this, "TextView4", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
