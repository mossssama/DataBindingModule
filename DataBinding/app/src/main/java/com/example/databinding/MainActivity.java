package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* With DataBinding */
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        /* Without DataBinding */
//        setContentView(R.layout.activity_main);
//        Button btn1= findViewById(R.id.btn1);
//        Button btn2= findViewById(R.id.btn2);
//        Button btn3= findViewById(R.id.btn3);
//        Button btn4= findViewById(R.id.btn4);
//        TextView tv= findViewById(R.id.tv);

        /* With DataBinding */
        binding.btn1.setOnClickListener( v-> binding.tv.setText("1") );
        binding.btn2.setOnClickListener( v-> binding.tv.setText("1") );
        binding.btn3.setOnClickListener( v-> binding.tv.setText("1") );
        binding.btn4.setOnClickListener( v-> binding.tv.setText("1") );

        /* Without DataBinding */
//        btn1.setOnClickListener( v -> tv.setText("1") );
//        btn2.setOnClickListener( v -> tv.setText("2") );
//        btn3.setOnClickListener( v -> tv.setText("3") );
//        btn4.setOnClickListener( v -> tv.setText("4") );


    }
}




///* Steps to use dataBinding */
//[1] Add dataBinding element to Manifest
//[2] Ensure that all the views in viewGroups have IDs
//[3]