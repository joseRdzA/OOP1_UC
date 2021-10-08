package com.Presupuesto.LogicaNegocio;

import com.Presupuesto.entidades.Movimiento;

public class ImplementacionSuperDymmy implements InterfaceRegistro {

    @Override
    public void getMovimientos() {
        System.out.println("No haga nada");
    }

    @Override
    public void addIngreso(String nombre, String moneda, String categoria, String monto, String periodicidad) {
        System.out.println("No haga nada");
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String monto) {
        System.out.println("No haga nada");
    }

    @Override
    public void getGastos() {
        System.out.println("No haga nada");
    }
}
