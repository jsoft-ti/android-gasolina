package br.com.fabricaapp.gasolina;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(this,2000);
    }


    @Override
    public void run() {
        Intent it = new Intent(this,PrincipalActivity.class);
        startActivity(it);
        finish();
    }
}
