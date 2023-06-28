package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {


    public  TextView textView;
    private final  String ACT1="com.example.mybroad";
    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView = findViewById(R.id.textView2);
        EditText editText1 = findViewById(R.id.editText1);
        Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent intent2 = new Intent();
                        intent2.setAction(editText1.getText().toString());
//                        intent2.setAction("com.example.mybroad");
                        Log.d("xdh","action:"+editText1.getText().toString());


//                Intent intent = new Intent();
//                intent.setAction("my.broadcast");
                        sendBroadcast(intent2);
            }
        });


        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(ACT1)) {
                    Log.d("xdh", "RECEIVED!");
                    Toast.makeText(MainActivity2.this, intent.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(intent.toString());
                }
            }
        };

        IntentFilter filter = new IntentFilter();
        filter.addAction(ACT1);
        filter.addAction("com.example.mybroad2");
        filter.addAction("com.example.mybroad3");
        registerReceiver(broadcastReceiver,filter);

    }

//
//    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter){
//
//
//        return registerReceiver(receiver,filter,null,null);
//    }
}