package com.example.builderdesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BuilderDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ABuilder cdBuilder = new ABuilder();
        AType cdTypeSamsung = cdBuilder.addA();
        cdTypeSamsung.showItems();
        cdTypeSamsung.removeItemA(0);
    }
}