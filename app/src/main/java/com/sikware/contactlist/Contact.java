package com.sikware.contactlist;

/**
 * Created by adam Pluth on 1/4/17.
 */

public class Contact {

    //private vars
    int _id;
    String _name;
    String _phone_number;

    //default constructor
    public Contact(){}

    // over loaded constructors
    public Contact(int _id, String _name, String _phone_number){
        this._id=_id;
        this._name=_name;
        this._phone_number=_phone_number;
    }
    public Contact(String _name, String _phone_number){
        this._name=_name;
        this._phone_number=_phone_number;
    }

    //getters
    public int getId(){return _id;}
    public String getName(){return _name;}
    public String getPhoneNumber(){return _phone_number;}
    //setters
    public void setId(int i){_id=i;}
    public void setName(String s){_name=s;}
    public void setPhoneNumber(String s){_phone_number=s;}

}
