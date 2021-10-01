package com.Presupuesto;

import com.Presupuesto.entidades.Gasto;
import com.Presupuesto.entidades.RegistroGastos;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Escribir esto para correr el sistema
    public static void main(String[] args) {

        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroGastos registro = new RegistroGastos();
        while (siga) {

            System.out.println("Digite el nombre de su gasto:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda de su gasto:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoría de su gasto:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su gasto:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);


            //Instanciar un objeto para poder usar la clase. El objeto es una clase instanciada y agarra lo que tengo en la clase y le asigna memoria.

            Gasto nuevoGasto = new Gasto(nombre,
                    moneda, categoria, monto);

            registro.addGastos(nuevoGasto);

            ;


       /* for (int i = 0; i<registro.getGastos().size(); i++){
            System.out.println(registro.getGastos().get(i).getNombre());
        }*/

        /*for (Gasto gastico :registro.getGastos()){
            //declaro primero la variable
            System.out.println(gastico.getNombre());
        }*/

        /*for(Gasto gastico : registro.getGastos()){
        * System.out.pprintln(gastico.getNombre());
        }*/

            for (Gasto gastico : registro.getGastos()) {
                System.out.println(gastico.getNombre());
            }

            System.out.println("Quiere seguir? ('S')");
            consola.nextLine();
            siga = consola.nextLine().equals("S");

        }


    }
}
