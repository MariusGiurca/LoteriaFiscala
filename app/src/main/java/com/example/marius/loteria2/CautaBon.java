package com.example.marius.loteria2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


public class CautaBon extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cauta_bon);
    }

    public void cautaBon(View v){
        TextView notifiacationCauta = (TextView) findViewById(R.id.textViewCautaBon);
        EditText dataEdit   = (EditText)findViewById(R.id.dataCautaBon);
        EditText sumaEdit   = (EditText)findViewById(R.id.cautaSuma);
        ServiciuBD db = new ServiciuBD(this);
        List<Bon> bonuri = db.Cauta_Bon(dataEdit.getText().toString(), sumaEdit.getText().toString());
        if (bonuri.size() > 0)
            notifiacationCauta.setText("Felicitari, ai un bon cu aceste date!");
        else
            notifiacationCauta.setText("Din pacate nu ai un asemenea bon! :(");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cauta_bon, menu);
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
