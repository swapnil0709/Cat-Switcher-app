package com.example.swapnil.catswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void changectas(View view){

        ImageView cat1 =(ImageView)findViewById(R.id.catid1);
        cat1.setImageResource(R.drawable.cat2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
