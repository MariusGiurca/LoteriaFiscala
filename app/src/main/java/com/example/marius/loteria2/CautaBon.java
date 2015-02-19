package com.example.marius.loteria2;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;


public class CautaBon extends Activity {

    Calendar calendar  = Calendar.getInstance();
    DateFormat dateFormat = DateFormat.getDateInstance();

    private EditText dataEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cauta_bon);
        dataEdit = (EditText)findViewById(R.id.dataCautaBon);
    }

    public void cautaBon(View v){
        TextView notifiacationCauta = (TextView) findViewById(R.id.textViewCautaBon);

        EditText sumaEdit   = (EditText)findViewById(R.id.cautaSuma);
        ServiciuBD db = new ServiciuBD(this);
        List<Bon> bonuri = db.Cauta_Bon(sumaEdit.getText().toString(), dataEdit.getText().toString());
        if (bonuri.size() > 0)
            notifiacationCauta.setText("Felicitari, ai un bon cu aceste date!");
        else
            notifiacationCauta.setText("Din pacate nu ai un asemenea bon! :(");
    }

    DatePickerDialog.OnDateSetListener d = new  DatePickerDialog.OnDateSetListener(){
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            dataEdit.setText(dateFormat.format(calendar.getTime()));
        }
    };


    public void edtiDataClickCauta(View v)
    {
        DatePickerDialog dp = new DatePickerDialog(CautaBon.this,d,calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
        dp.show();
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
            startActivity(new Intent(getApplicationContext(),Despre.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
