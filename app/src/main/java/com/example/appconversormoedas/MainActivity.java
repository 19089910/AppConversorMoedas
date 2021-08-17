package com.example.appconversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sem viewHolder: dota chamada sera feita assim
        //EditText valor = findViewById(R.id.edit_value);percorre por toda activity_main.xml buscando edit_value varias vezes.
        //<TipoEditText> <nome> = BuscarPorId(diretorio);

        //viewHolder: capiturar os valores uma vez.
        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculete = findViewById(R.id.botton_calculete);
        //<Class.TipoEditText.nome> = BuscarPorId(diretorio);

        //funcao e logica do click
        this.mViewHolder.buttonCalculete.setOnClickListener(this);

        //funcao para linpar os valores no final do print
        this.cliarValue();
    }
    //funcao e logica do click
    @Override
    public void onClick(View v) {
        //logica do butao
        if(v.getId() == R.id.botton_calculete) {//escolher o butao certo
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)) {
                //msg para nao ser vazio
                Toast.makeText(this, this.getString(R.string.informe_valor), Toast.LENGTH_SHORT).show();
            } else {
                //logica do butao quando clicado
            }
        }
    }
    //funcao para linpar os valores no final do print
    private void cliarValue(){
        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");
    }
    //viewHolder: capiturar os valores uma vez.
    private static class ViewHolder {//percorre 1 vez e capitura todos os metodos na sua propia classe
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculete;
    }
}