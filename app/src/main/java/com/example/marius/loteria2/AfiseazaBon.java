package com.example.marius.loteria2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


public class AfiseazaBon extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afiseaza_bon);

        ListView lista = (ListView) findViewById(R.id.listaBonuri);
        ServiciuBD db = new ServiciuBD(this);
        List<Bon> bonuri = db.Get_Bonuri();
        ArrayAdapter<Bon> adapter = new ArrayAdapter<Bon>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, bonuri);


        // Assign adapter to ListView
        lista.setAdapter(adapter);
    }

    public void goToAdaugaBonActivity(View v)
    {
//        Button cautaBon = (Button) v;
        startActivity(new Intent(getApplicationContext(),AdaugaBon.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_afiseaza_bon, menu);
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