package by.matveev.snackbar;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Example extends AppCompatActivity {
    Button btnDefaultSnack,
            btnCustomSnack,
            btnSnackWithAction,
            btnSnackWithTextPosition,
            btnCustomSnackPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        /***Initialize layout***/
        btnDefaultSnack = findViewById(R.id.btnDefaultSnack);
        btnCustomSnack = findViewById(R.id.btnCustomSnack);
        btnSnackWithAction = findViewById(R.id.btnSnackWithAction);
        btnSnackWithTextPosition = findViewById(R.id.btnSnackWithTextPosition);
        btnCustomSnackPosition = findViewById(R.id.btnCustomSnackPosition);

        /***Display Simple SnackBar***/
        btnDefaultSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Default SnackBar", Snackbar.LENGTH_SHORT).show();
            }
        });

        /***Display SnackBar with Custom Background and Text Color***/
        btnCustomSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "SnackBar with Custom Background and Custom Text";
                Snackbar snack = Snackbar.make(v,
                        Html.fromHtml("<font color=\"#ffffff\"><b>" +
                                message + "<b></font>"), Snackbar.LENGTH_SHORT);
                snack.getView().setBackgroundColor(ContextCompat.getColor(v.getContext(),android.R.color.holo_blue_dark));
                snack.show();
            }
        });

        /***Display SnackBar With Custom Text Position***/
        btnSnackWithTextPosition.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                final Snackbar snack = Snackbar.make(v, "SnackBar with Action", Snackbar.LENGTH_SHORT);
                snack.getView().setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                View view = snack.getView();
                TextView setTextGravity = view.findViewById(android.support.design.R.id.snackbar_text);
                setTextGravity.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                snack.show();
            }
        });

        /***Display SnackBar With Custom Position (Show int Top of the Screen***/
        btnCustomSnackPosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View customPosition = findViewById(R.id.customSnack);
                final Snackbar snack = Snackbar.make(v, "")
            }
        });
    }
}
