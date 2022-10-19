package com.edwin.ejercicio3_pruebalogica.Interface;

public interface InterfaceMain {

    interface View{
        void finElement();
    }

    interface Presenter{
        boolean palindromo(String texto);
    }

    interface Model{
        boolean palindromo(String texto);
    }
}
