package com.example.owner.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Visualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);
        Bundle b = getIntent().getExtras();
        String valor;
        valor = b.getString("nombre");
        TextView re = (TextView) findViewById(R.id.Resultado);
        re.setText(valor);
    }
}
