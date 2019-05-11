package com.android.romario.autonoma2019_android_tarea03b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUsuario, etClave;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        etUsuario=(EditText) findViewById(R.id.edUsuario);
        etClave=(EditText) findViewById(R.id.edClave);

        btnLogin=(Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logearse hardcode
                if(etUsuario.getText().toString().equals("romario") &&
                        etClave.getText().toString().equals("1234")){
                    //
                   /* Intent intent = new Intent(
                            MainActivity.this,
                            ProfesoresActivity.class);*/
                    Intent intent = new Intent(
                            MainActivity.this,
                            MapsActivity.class);
                    //Ir a Profesor Activity
                    startActivity(intent);

                }//if
            }//onclick
        });//setOnClickListener


    }
}
