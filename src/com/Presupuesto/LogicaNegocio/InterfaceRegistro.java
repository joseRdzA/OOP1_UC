package com.Presupuesto.LogicaNegocio;

import com.Presupuesto.entidades.Movimiento;
import com.Presupuesto.repo.ErrorMuyPocaData;

import java.util.List;

public interface InterfaceRegistro {



    boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData;

    boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData;


}
