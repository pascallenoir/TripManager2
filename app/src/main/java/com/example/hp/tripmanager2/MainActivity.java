package com.example.hp.tripmanager2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bouton1(View view){
        Button btn1 = (Button) findViewById(R.id.btn1);
        TranslateAnimation Translate = new TranslateAnimation(0, 100, 0, 0);
        Translate.setDuration(300);
        btn1.startAnimation(Translate);

        Intent identite = new Intent (MainActivity.this, second.class);
        startActivity(identite);
    }
    
    public void Bouton2(View view){
        Button btn2 = (Button) findViewById(R.id.btn2);
        TranslateAnimation Translate = new TranslateAnimation(0, 100, 0, 0);
        Translate.setDuration(500);
        btn2.startAnimation(Translate);

        Intent check = new Intent (MainActivity.this, third.class);
        startActivity(check);
    }
}
