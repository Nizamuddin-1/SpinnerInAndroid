package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  Spinner s;
  ArrayList <String> a= new ArrayList<>();
  AutoCompleteTextView t;
  ArrayList<String> tex = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = findViewById(R.id.sp);
        t = findViewById(R.id.au);
        a.add("Aadhar Card");
        a.add("Pan Card");
        a.add("Voter id Card");
        a.add("Driving Leisence Card");
        a.add("Ration Card");
        a.add("Xth score Card");
        a.add("XIIth score Card");
        ArrayAdapter<String> p = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,a);
        s.setAdapter(p);
        tex.add("c");
        tex.add("c++");
        tex.add("Java");
        tex.add("PHP");
        tex.add("HTML");
        tex.add("Python");
        ArrayAdapter<String> at = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tex);
        t.setAdapter(at);
        t.setThreshold(1);
    }
}