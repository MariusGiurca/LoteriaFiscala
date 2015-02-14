package com.example.marius.loteria2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ServiciuBD db = new ServiciuBD(this);
        Log.v(TAG, "It works");
        Bon b = new Bon("MERE231432414321", "3/3/2015", "23.3");
        db.Add_Bon(b);
        List<Bon> bonuri = db.Get_Bonuri();

        Log.v(TAG, bonuri.toString());
    }

    public void goToAdaugaBonActivity(View v)
    {
//        Button adaugaBon = (Button) v;
        startActivity(new Intent(getApplicationContext(),AdaugaBon.class));
    }

    public void goToCautaBonActivity(View v)
    {
//        Button cautaBon = (Button) v;
        startActivity(new Intent(getApplicationContext(),CautaBon.class));
    }

    public void goToAfiseazaBonActivity(View v)
    {
//        Button afiseazaBon = (Button) v;
        startActivity(new Intent(getApplicationContext(),AfiseazaBon.class));
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
