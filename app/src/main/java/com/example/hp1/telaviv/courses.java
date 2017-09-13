package com.example.hp1.telaviv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class courses extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv1;
    ArrayList<String> courses= new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        lv1= (ListView) findViewById(R.id.lv1);
        courses.add(new String("Computers"));



        courses.add(new String("Doctor"));
        courses.add(new String("trash man"));
        courses.add(new String("teacher"));


        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,courses);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
