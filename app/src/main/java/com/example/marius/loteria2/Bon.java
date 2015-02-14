package com.example.marius.loteria2;

/**
 * Created by cristianstaicu on 04/02/15.
 */
public class Bon {

    public int _id;

    public String seria;
    public String data;
    public String suma;

    public Bon() {
    }

    // constructor
    public Bon(int id, String seria, String data, String suma) {
        this._id = id;
        this.seria = seria;
        this.data = data;
        this.suma = suma;

    }

    // constructor
    public Bon(String name, String data, String suma) {
        this.seria = name;
        this.data = data;
        this.suma = suma;
    }

    // getting ID
    public int getID() {
        return this._id;
    }

    // setting id
    public void setID(int id) {
        this._id = id;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "[" + getID() + ", " + getSeria() + ", " + getData() + ", " + getSuma() + "]";
    }
}
