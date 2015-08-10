package com.sandeep.android.project0;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    Button button_spotify;
    Button button_scores;
    Button button_library;
    Button button_build;
    Button button_xyz;
    Button button_capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_spotify = (Button) findViewById(R.id.button_spotify);
        button_scores = (Button) findViewById(R.id.button_scores);
        button_library = (Button) findViewById(R.id.button_library);
        button_build = (Button) findViewById(R.id.button_build);
        button_xyz = (Button) findViewById(R.id.button_xyz);
        button_capstone = (Button) findViewById(R.id.button_capstone);

        button_spotify.setOnClickListener(this);
        button_scores.setOnClickListener(this);
        button_library.setOnClickListener(this);
        button_build.setOnClickListener(this);
        button_xyz.setOnClickListener(this);
        button_capstone.setOnClickListener(this);

    }

    public void onClick(View v) {
        String toastString = "This button will launch ";
        if (v == button_spotify) {
            String name = button_spotify.getText().toString().toLowerCase();
            toastString += name + "!";
            Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_SHORT).show();
        } else if (v == button_scores) {
            String name = button_scores.getText().toString().toLowerCase();
            toastString += name + "!";
            Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_SHORT).show();
        } else if (v == button_library) {
            String name = button_library.getText().toString().toLowerCase();
            toastString += name + "!";
            Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_SHORT).show();
        } else if (v == button_build) {
            String name = button_build.getText().toString().toLowerCase();
            toastString += name + "!";
            Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_SHORT).show();
        } else if (v == button_xyz) {
            String name = button_xyz.getText().toString().toLowerCase();
            toastString += name + "!";
            Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_SHORT).show();
        } else if (v == button_capstone) {
            String name = button_capstone.getText().toString().toLowerCase();
            toastString += name + "!";
            Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
