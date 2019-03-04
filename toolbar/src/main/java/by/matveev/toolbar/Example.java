package by.matveev.toolbar;

import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class Example extends AppCompatActivity {

    AppBarLayout appBarLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);


        /***Initialize AppBarLayout and ToolBar***/
        appBarLayout = findViewById(R.id.appBar);
        toolbar = findViewById(R.id.toolBar);

        /***Set ActionBar to ToolBar***/
        setSupportActionBar(toolbar);

        /***setDisplayHomeAsUpEnabled will display a back arrow button in ToolBar***/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /***Set a Title to ToolBar***/
        getSupportActionBar().setTitle("Toolbar");
        /***Set subtitle to our ToolBar***/
        getSupportActionBar().setSubtitle("subtitle");
        /***setNavigationOnClickListener will invoke on Back Button in ToolBar***/
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /***Set a Menu***/
        getMenuInflater().inflate(R.menu.ex_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //***When Select a Menu or Submenu***/
        if(item.getItemId() == R.id.menu1){
            Toast.makeText(getApplicationContext(), "Menu 1 is Selected", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.menu2){
            Toast.makeText(getApplicationContext(), "Menu 2 is Selected", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.smenu1){
            Toast.makeText(getApplicationContext(), "SubMenu 1 is Selected", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.smenu2){
            Toast.makeText(getApplicationContext(), "SubMenu 2 is Selected", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
