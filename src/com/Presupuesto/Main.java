package com.Presupuesto;

import com.Presupuesto.LogicaNegocio.ImplementacionSuperDymmy;
import com.Presupuesto.LogicaNegocio.InterfaceRegistro;
import com.Presupuesto.entidades.Movimiento;
import com.Presupuesto.ui.FrontEnd;
import com.Presupuesto.LogicaNegocio.ImplementacionRegistro;
import com.Presupuesto.repo.InMemoryRepository;
import java.util.Scanner;

public class Main {
    //Escribir esto para correr el sistema
    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        FrontEnd fe = new FrontEnd("Sistema de Registro de Movimientos");
        fe.build();
        /*
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        System.out.println("Que quiere usar? fake? (F)");
        InterfaceRegistro registro;
        if(consola.nextLine().equals("F")){
            registro = new ImplementacionSuperDymmy();
        } else{
            registro = new ImplementacionSuperDymmy();
        }

        while (siga) {


            System.out.println("Digite el nombre de su movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda de su movimiento:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoría de su movimiento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su movimiento:");
            String montoStr = consola.nextLine();


            System.out.println("Indique si es un gasto (S)");
            if (consola.nextLine().equals("S")) {
                registro.addGasto(nombre,moneda,categoria,montoStr);
            } else {
                System.out.println("Especifique la perioricidad: ");
                String perioricidad = consola.nextLine();
                registro.addIngreso(nombre,
                        moneda,
                        categoria,
                        montoStr,
                        perioricidad);
            }

            System.out.println("Todos los movimientos");
            registro.getMovimientos();

            System.out.println("Solo los gastos");
            registro.getGastos();
            System.out.println("Quiere seguir? (S)");
            siga = consola.nextLine().equals("S");


        } */
    }
}
