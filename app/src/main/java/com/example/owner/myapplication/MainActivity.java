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
        EditText Texto =(EditText) findViewById(R.id.txtnombre);
        Toast.makeText(this, "Saludos:"+Texto.getText(), Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,Visualizar.class);
        Bundle bundle= new Bundle();
        bundle.putString("Nombre",Texto.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
