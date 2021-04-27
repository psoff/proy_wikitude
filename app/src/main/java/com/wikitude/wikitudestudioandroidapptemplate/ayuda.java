package com.wikitude.wikitudestudioandroidapptemplate;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ayuda extends AppCompatActivity implements View.OnClickListener {

    private Button atrasprincipal ;
    private TextView texto;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda);
        setTheme(R.style.Theme_AppCompat);
        atrasprincipal=(Button) findViewById(R.id.atras_principal);
        atrasprincipal.setOnClickListener(this);
        texto=(TextView) findViewById(R.id.texto);
    }


    public void onClick(View view) {

        if (view == atrasprincipal){
            Intent b2 = new Intent(this, actprincipal.class);
            startActivity(b2);
        }

    }



}
