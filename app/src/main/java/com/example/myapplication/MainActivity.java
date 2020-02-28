package com.example.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.nfc.Tag;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    private Button countButton;
    private Button toastButton;
    private TextView textView;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        countButton = findViewById(R.id.countButton);
        toastButton = findViewById(R.id.toastButton);
        textView = findViewById(R.id.textView);



        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                count++;
                textView.setText("" + count);
                Log.d(TAG,"count: " +count);
                int x = 10/0;}
                catch(ArithmeticException e){
                    e.printStackTrace();

                    }

            }
        });


        toastButton.setOnClickListener(new View.OnClickListener() {
            private YesNoClickListner listner;
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("This is custom Dialog")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                listner.yesClicked();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                listner.noClicked();
                            }
                        }).create().show();




//                Toast toast = Toast.makeText(MainActivity.this,
//                        "This is a toast", Toast.LENGTH_SHORT);
//                toast.show();
            }
        });
    }
}