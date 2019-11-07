package com.example.swaping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int temp;
        int x=78;
        int y=67;
        System.out.println("before swap"+x+""+y);
        temp=y;
        y=x;
        x=temp;
        System.out.println("after swap is"+x+""+y);



    }
}
