package com.Presupuesto;

import java.util.ArrayList;

public class Main {
    //Escribir esto para correr el sistema
    public static void main(String[] args){

        System.out.println("Nuevo Main");
        System.out.println("-------------------------");

        //Instanciar un objeto para poder usar la clase. El objeto es una clase instanciada y agarra lo que tengo en la clase y le asigna memoria.

        Gasto gastoLuz = new Gasto();
        gastoLuz.nombre = "Luz";
        gastoLuz.moneda = "Colones";
        gastoLuz.monto = 20000;
        System.out.println(gastoLuz.nombre + " -> " + gastoLuz.monto);


        Gasto gastoInternet = new Gasto();
        gastoInternet.nombre = "Internet";
        gastoLuz.moneda = "Colones";
        gastoInternet.monto = 15000;
        System.out.println(gastoInternet.nombre + " -> " + gastoInternet.monto);


        RegistroGastos registro = new RegistroGastos();
        registro.gastos = new ArrayList<>();
        registro.gastos.add(gastoLuz);
        registro.gastos.add(gastoInternet);

        System.out.println(gastoInternet.nombre + " -> " + gastoInternet.monto);
        System.out.println(gastoLuz.nombre + " -> " + gastoLuz.monto);

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i<registro.gastos.size(); i++){
            System.out.println(registro.gastos.get(i).nombre);
        }



    }
}
