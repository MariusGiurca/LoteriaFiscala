package com.example.marius.loteria2;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class AdaugaBon extends Activity {

    Calendar calendar  = Calendar.getInstance();
    DateFormat dateFormat = DateFormat.getDateInstance();
    private EditText dataEdit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adauga_bon);
        dataEdit   = (EditText)findViewById(R.id.editTextDate);
    }
    private TextView notificationAdd;


    public void adaugaBon(View v)
    {
//        Button adaugaBon = (Button) v;
        notificationAdd = (TextView) findViewById(R.id.textViewAdaugaBon);
        EditText sumaEdit   = (EditText)findViewById(R.id.editTextSumaBon);
        EditText codEdit   = (EditText)findViewById(R.id.editTextCodBon);
        Bon b = new Bon(codEdit.getText().toString(), dataEdit.getText().toString(), sumaEdit.getText().toString());
        ServiciuBD db = new ServiciuBD(this);
        db.Add_Bon(b);
        notificationAdd.setText("Bonul " + b + " a fost adaugat cu succes. Acum sunt " + db.Get_Bonuri().size() + " bonuri!");

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


    public void edtiDataClick(View v)
    {
        DatePickerDialog dp = new DatePickerDialog(AdaugaBon.this,d,calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
        dp.show();
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
