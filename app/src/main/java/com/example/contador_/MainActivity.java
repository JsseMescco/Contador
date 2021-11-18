package com.example.contador_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        mostrarResultado();
    }

    private void mostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.ContadorPosiciones);
        textoResultado.setText("Contador: "+contador);
    }

    public void incrementarContador(View view) {
        contador++;
        mostrarResultado();
    }

    public void decrementaContador(View view) {
        contador--;
        mostrarResultado();
    }

    public void reseteaContador(View view) {
        contador=0;
        mostrarResultado();
    }
}