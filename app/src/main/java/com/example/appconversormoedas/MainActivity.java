package com.example.appconversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText valor = findViewById(R.id.edit_value);percorre por toda activity_main.xml buscando edit_value varias vezes.
        //<TipoEditText> <nome> = BuscarPorId(diretorio);

        this.mViewHolder.editText = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculete = findViewById(R.id.botton_calculete);
        //<Class.TipoEditText.nome> = BuscarPorId(diretorio);

        this.mViewHolder.buttonCalculete.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.botton_calculete) {
            //Logica
        }
    }

    private static class ViewHolder {//percorre 1 vez e capitura todos os metodos na sua propia classe
        EditText editText;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculete;
    }
}