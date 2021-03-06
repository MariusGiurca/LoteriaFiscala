package com.example.marius.loteria2;

/**
 * Created by cristianstaicu on 04/02/15.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ServiciuBD extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "loteria.db";

    // Contacts table name
    private static final String TABLE_BONURI = "bonuri";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_SERIA = "seria";
    private static final String KEY_DATA = "data";
    private static final String KEY_SUMA = "suma";
    private final ArrayList<Bon> contact_list = new ArrayList<Bon>();

    public ServiciuBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_BONURI + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_SERIA + " TEXT,"
                + KEY_DATA + " TEXT," + KEY_SUMA + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BONURI);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    public void Add_Bon(Bon bon) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SERIA, bon.getSeria()); // Contact Name
        values.put(KEY_DATA, bon.getData()); // Contact Phone
        values.put(KEY_SUMA, bon.getSuma()); // Contact Email
        // Inserting Row
        db.insert(TABLE_BONURI, null, values);
        db.close(); // Closing database connection
    }

    // Getting single contact
    Bon Get_Bon(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_BONURI, new String[] { KEY_ID,
                        KEY_SERIA, KEY_DATA, KEY_SUMA}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Bon contact = new Bon(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return contact
        cursor.close();
        db.close();

        return contact;
    }

    // Getting All Contacts
    public ArrayList<Bon> Get_Bonuri() {
        try {
            contact_list.clear();

            // Select All Query
            String selectQuery = "SELECT  * FROM " + TABLE_BONURI;

            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);

            // looping through all rows and adding to list
            if (cursor.moveToFirst()) {
                do {
                    Bon contact = new Bon();
                    contact.setID(Integer.parseInt(cursor.getString(0)));
                    contact.setSeria(cursor.getString(1));
                    contact.setData(cursor.getString(2));
                    contact.setSuma(cursor.getString(3));
                    // Adding contact to list
                    contact_list.add(contact);
                } while (cursor.moveToNext());
            }

            // return contact list
            cursor.close();
            db.close();
            return contact_list;
        } catch (Exception e) {
            // TODO: handle exception
            Log.e("AIUREA", "all_contact", e);
        }

        return contact_list;
    }

    // Updating single contact
    public List<Bon> Cauta_Bon(String suma, String data) {
        SQLiteDatabase db = this.getWritableDatabase();
        //TODO solve this SQL injection
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_BONURI + " WHERE " + KEY_DATA + "='" + data + "' and " + KEY_SUMA + "='" + suma + "'", null);
        List<Bon> result = new ArrayList<Bon>();
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Bon contact = new Bon();
                contact.setID(Integer.parseInt(cursor.getString(0)));
                contact.setSeria(cursor.getString(1));
                contact.setData(cursor.getString(2));
                contact.setSuma(cursor.getString(3));
                // Adding contact to list
                result.add(contact);
            } while (cursor.moveToNext());
        }

        // return contact list
        cursor.close();
        db.close();
        return result;
    }


    // Updating single contact
    public int Update_Bon(Bon contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_SERIA, contact.getSeria());
        values.put(KEY_DATA, contact.getData());
        values.put(KEY_SUMA, contact.getSuma());

        // updating row
        return db.update(TABLE_BONURI, values, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.getID()) });
    }

    // Deleting single contact
    public void Delete_Bon(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_BONURI, KEY_ID + " = ?",
                new String[] { String.valueOf(id) });
        db.close();
    }

    // Getting contacts Count
    public int Get_Total_Bonuri() {
        String countQuery = "SELECT  * FROM " + TABLE_BONURI;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}