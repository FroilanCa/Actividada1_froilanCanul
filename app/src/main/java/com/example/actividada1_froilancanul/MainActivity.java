package com.example.actividada1_froilancanul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    }

    public void clic (view vista){
        Toast.makeText(getBaseContext(), text: "hola", Toast.LENGTH_SHORT).show();
    }
}