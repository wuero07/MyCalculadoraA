package com.example.mycalculadoraa;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnIniciar;
    EditText campo;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.init);
        campo = (EditText) findViewById(R.id.iniciar2);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sum < 3) {
                    sum = sum + 1;
                    //Toast.makeText(getApplicationContext(),"Llevas  " +sum+ " clicks realizados",Toast.LENGTH_SHORT).show();

                    //Intent intent = new Intent(getApplicationContext(), Menu.class);
                    String datos = campo.getText().toString();
                    try {
                        String[] letras = datos.split("sa");
                        //Toast.makeText(getApplicationContext(), "Parte 1: " + letras[0] + " Parte 2:" +, Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Error :" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }


                    if (datos.equals("12345")) {
                        //intent.putExtra("mensaje",user+"|"+pass);
                        //startActivity(intent);letras[1]
                        Toast.makeText(getApplicationContext(), "Logueado Correctamente...", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Password incorrecto, te quedan:  " + (3 - sum) + " Intentos", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Excediste tus oportunidades", Toast.LENGTH_SHORT).show();
                    btnIniciar.setEnabled(false);
                }


            }
        });
    }
}