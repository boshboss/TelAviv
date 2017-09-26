package com.example.hp1.telaviv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thankyou extends AppCompatActivity implements View.OnClickListener{
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==back){
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }

    }
}
