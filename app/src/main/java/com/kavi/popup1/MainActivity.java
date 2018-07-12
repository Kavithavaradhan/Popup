package com.kavi.popup1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button popbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popbutton = (Button) findViewById(R.id.popupbutton);

        popbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popup = new PopupMenu(MainActivity.this, popbutton);

                popup.getMenuInflater().inflate(R.menu.popupmenu,popup.getMenu());

              /*  popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        Toast.makeText()


                        return false;
                    }
                });*/

              popup.show();

            }


        });

    }
}
