package com.example.owner.myapplication;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accion(View view) {
        EditText texto =(EditText) findViewById(R.id.txtNombre);
        Toast.makeText(this, "Saludos:"+texto.getText(), Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,Visualizar.class);
        intent.putExtra("nombre", texto.getText());
        startActivity(intent);


    }
}
