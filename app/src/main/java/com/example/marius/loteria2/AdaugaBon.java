package com.example.marius.loteria2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AdaugaBon extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adauga_bon);
    }
    private TextView notificationAdd;

    public void adaugaBon(View v)
    {
//        Button adaugaBon = (Button) v;
        notificationAdd = (TextView) findViewById(R.id.textViewAdaugaBon);
        EditText sumaEdit   = (EditText)findViewById(R.id.editTextSumaBon);
        EditText dataEdit   = (EditText)findViewById(R.id.editTextDate);
        EditText codEdit   = (EditText)findViewById(R.id.editTextCodBon);
        Bon b = new Bon(codEdit.getText().toString(), dataEdit.getText().toString(), sumaEdit.getText().toString());
        ServiciuBD db = new ServiciuBD(this);
        Bon b = new Bon("MERE231432414321", "3/3/2015", "23.3");
        db.Add_Bon(b);
        notificationAdd.setText("Bonul " + b + " a fost adaugat cu succes");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_adauga_bon, menu);
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
