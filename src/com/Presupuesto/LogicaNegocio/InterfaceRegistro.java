package com.Presupuesto.LogicaNegocio;

import com.Presupuesto.entidades.Movimiento;

import java.util.List;

public interface InterfaceRegistro {

    void getMovimientos();

    void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

    void addGasto(String nombre, String moneda, String categoria, String montoStr);

    void getGastos();
}
