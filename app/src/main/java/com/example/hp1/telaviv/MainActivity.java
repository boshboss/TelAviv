package com.example.hp1.telaviv;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btcourse,btinfo,btregister,btphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btphone=(Button)findViewById(R.id.btphone);
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
        if(v==btregister){
            Intent i=new Intent(this,registration.class);
            startActivity(i);

        }
    }
    public void getnotification(View view){
        NotificationManager notificationmgr = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Notification notif = new Notification.Builder(this)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle("Phone:+972-3-640-8118")
                .setContentText("Fax:03-633-0808")
                .build();
        notificationmgr.notify(0,notif);
    }

}
