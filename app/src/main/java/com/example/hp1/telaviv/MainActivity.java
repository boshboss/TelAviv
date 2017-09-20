package com.example.hp1.telaviv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btcourse,btinfo,btregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btcourse=(Button)findViewById(R.id.btcourse);
        btinfo=(Button)findViewById(R.id.btinfo);
        btregister=(Button)findViewById(R.id.btregister);
        btcourse.setOnClickListener(this);
        btregister.setOnClickListener(this);
        btinfo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btcourse){
            Intent i=new Intent(this,courses.class);
            startActivity(i);
        }
        if(v==btinfo){
            Intent i=new Intent(this,information.class);
            startActivity(i);
        }
    }
}
