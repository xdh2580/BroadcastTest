package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this,MainActivity3.class);
                startActivity(intent2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent();
                intent3.setClass(MainActivity.this,MainActivity4.class);
                startActivity(intent3);
            }
        });

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                Intent intent2 = new Intent();
//                intent2.setAction("my.brodcast");
//                int a = 0 ;
//                while (a<5){
//                    sendBroadcast(intent2);
//                    a++;
//                    Log.d("xdh",a+"\nbroadcast:"+intent2.toString());
//                    try {
//                        Thread.sleep(6000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();


//        IntentFilter filter = new IntentFilter();
//        filter.addAction("com.example.mybroad");
//        filter.addAction("com.example.mybroad2");
//        filter.addAction("com.example.mybroad3");
//        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                Toast.makeText(MainActivity.this,intent.toString(), Toast.LENGTH_SHORT).show();
//            }
//        };
//
//        registerReceiver(broadcastReceiver,filter);
    }

}