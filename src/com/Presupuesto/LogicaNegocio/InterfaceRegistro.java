package com.Presupuesto.LogicaNegocio;

import com.Presupuesto.entidades.Movimiento;

import java.util.List;

public interface InterfaceRegistro {



    boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

    boolean addGasto(String nombre, String moneda, String categoria, String montoStr);

    void getMovimientos();

    void getGastos();
}
