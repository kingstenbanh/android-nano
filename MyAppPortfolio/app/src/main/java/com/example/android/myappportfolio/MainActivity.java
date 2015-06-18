package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    String message = "Launching ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showApp1(View view) {
        String appName = "Spotify Streamer";
        createToast(message + appName);
    }

    public void showApp2(View view) {
        String appName = "Scores";
        createToast(message + appName);
    }

    public void showApp3(View view) {
        String appName = "Library";
        createToast(message + appName);
    }

    public void showApp4(View view) {
        String appName = "Build It Bigger";
        createToast(message + appName);
    }

    public void showApp5(View view) {
        String appName = "XYZ Reader";
        createToast(message + appName);
    }

    public void showApp6(View view) {
        String appName = "Capstone";
        createToast(message + appName);
    }

    public void createToast(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
