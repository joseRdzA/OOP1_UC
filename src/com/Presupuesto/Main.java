package com.Presupuesto;

import com.Presupuesto.entidades.Gasto;
import com.Presupuesto.entidades.Ingreso;
import com.Presupuesto.entidades.Movimiento;
import com.Presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;

public class Main {
    //Escribir esto para correr el sistema
    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroMovimientos registro = new RegistroMovimientos();
        while (siga) {

            System.out.println("Digite el nombre de su movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda de su movimiento:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoría de su movimiento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su movimiento:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);


            Movimiento nuevoMovimiento;

            System.out.println("Indique si es un gasto (S)");
            if(consola.nextLine().equals("S")){
                nuevoMovimiento = new Gasto(nombre,
                        moneda, categoria, monto);
            } else {
                System.out.println("Especifique la perioricidad: ");
                String perioricidad = consola.nextLine();
                nuevoMovimiento = new Ingreso(nombre,
                        moneda, categoria,
                        monto,perioricidad);
            }

            registro.addMovimiento(nuevoMovimiento);


            //Instanciar un objeto para poder usar la clase. El objeto es una clase instanciada y agarra lo que tengo en la clase y le asigna memoria.

           /* Gasto nuevoGasto = new Gasto(nombre,
                    moneda, categoria, monto);

            registro.addMovimiento(nuevoGasto);*/



        /*for (Gasto gastico :registro.getGastos()){
            //declaro primero la variable
            System.out.println(gastico.getNombre());
        }*/

        /*for(Gasto gastico : registro.getGastos()){
        * System.out.pprintln(gastico.getNombre());
        }*/
            System.out.println("Todos los movimientos");
            for(Movimiento movimientos : registro.getMovimientos()){
                System.out.println(movimientos.getNombre());

            }


            for (Movimiento gastico : registro.getMovimientos()) {
                System.out.println(gastico.getNombre());

                System.out.println("Quiere seguir? ('S')");
                siga = consola.nextLine().equals("S");
            }



        }


    }
}
