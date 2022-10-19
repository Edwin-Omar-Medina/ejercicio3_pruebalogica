package com.edwin.ejercicio3_pruebalogica.Modelos;

import android.content.Context;

import com.edwin.ejercicio3_pruebalogica.Interface.InterfaceMain;

public class ModelMain implements InterfaceMain.Model {
    InterfaceMain.Presenter presenter;

    Context context;
    public ModelMain(Context context, InterfaceMain.Presenter presenter) {
        this.context = context;
        this.presenter = presenter;
    }


    @Override
    public boolean palindromo(String texto) {

        StringBuilder stringBuilder = new StringBuilder(texto);
        /*
        String textoreversa=stringBuilder.reverse().toString();
        boolean verdad=false;
        if(texto.equals(textoreversa)){
            verdad=true;
            System.out.println("Esto es el resultado dentro"+verdad);
        }

        System.out.println("Esto es el resultado fuera"+verdad);*/
        boolean verdad = false;
        int cantidad = texto.length();
        int contador=0;
        int contador2=cantidad;

        for(int i=0; i<cantidad; i++){

            if(texto.substring(i,(i+1)).equals(texto.substring(contador2-1,contador2))){
                contador++;
                System.out.println("Si ingreso al condicional ");
            }
            contador2--;
        }
        if(contador==cantidad){
            verdad=true;
        }
        System.out.println(contador);
        System.out.println(texto.substring(0,1));
        System.out.println(texto.substring(2,3));
        System.out.println(cantidad);




        return verdad;
    }
}
