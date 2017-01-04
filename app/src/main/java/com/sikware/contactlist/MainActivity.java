package com.sikware.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);
        Log.d("Insert: ", "Inserting...");
        db.addContact(new Contact("Bob", "9100000000"));
        db.addContact(new Contact("Joe", "9199999999"));
        db.addContact(new Contact("Carol", "9522222222"));
        db.addContact(new Contact("Darek", "9533333333"));
        db.addContact(new Contact("moe", "205-go-to-mars"));

        Log.d("Reading", "Reading...");
        List<Contact> contacts = db.getAllContact();

        for (Contact cn : contacts){
            String log = "Id: " + cn.getId() + " ,Name: " + cn.getName() + " ,PhoneNumber: " +cn.getPhoneNumber();
            Log.d("Name", log);
        }

    }
}
