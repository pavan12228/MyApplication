package com.example.ravinderreddy.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends Activity {
    Button  button;
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.spalsh_layout);
        button= (Button) findViewById(R.id.text);
        Log.d("pavan11111","onCreate was clicked");


    }
    
    
    
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("pavan11111","onStart was clicked");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("pavan11111","onResume was clicked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pavan11111","onPause was clicked");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("pavan11111","onStop was called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("pavan11111","onRestart was clicked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("pavan11111","onDestroy  was clicked");

    }



}

