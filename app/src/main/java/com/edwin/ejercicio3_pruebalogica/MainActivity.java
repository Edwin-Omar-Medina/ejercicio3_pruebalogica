package com.edwin.ejercicio3_pruebalogica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.edwin.ejercicio3_pruebalogica.Interface.InterfaceMain;
import com.edwin.ejercicio3_pruebalogica.Presentadores.PresenterMain;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener, InterfaceMain.View{

    EditText txtentrada;
    TextView viewsalida;
    Button btnimprimir;
    InterfaceMain.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.finElement();
        presenter = new PresenterMain(this,MainActivity.this);


    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        if(!txtentrada.getText().toString().equals("")){
            String textoingresa=txtentrada.getText().toString();
            if(presenter.palindromo(textoingresa)){
                viewsalida.setText(R.string.si);
            }else{
                viewsalida.setText(R.string.no);
            }
            txtentrada.setText("");
        }

    }

    @Override
    public void finElement() {
        txtentrada=findViewById(R.id.txtentrada);
        viewsalida=findViewById(R.id.viewsalida);
        btnimprimir=findViewById(R.id.btnimprimir);
        btnimprimir.setOnClickListener(this);
    }
}