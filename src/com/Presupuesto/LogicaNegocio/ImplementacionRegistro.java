package com.Presupuesto.LogicaNegocio;

import com.Presupuesto.entidades.Gasto;
import com.Presupuesto.entidades.Ingreso;
import com.Presupuesto.entidades.Movimiento;
import com.Presupuesto.repo.ErrorMuyPocaData;
import com.Presupuesto.repo.InterfaceRepository;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro {


    private InterfaceRepository repository;

    // Constructor
    public ImplementacionRegistro(InterfaceRepository repository) {
        this.repository = repository;
    }



    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData {
        int monto;
        try {
            monto = Integer.parseInt(montoStr);
        }catch (NumberFormatException ex){
            throw new FormatoInvalido(montoStr, ex.getMessage());
        }

        Ingreso ingreso = new Ingreso(nombre,
                moneda,
                categoria,
                monto,
                periodicidad);
        return this.repository.save(ingreso.getDetails());
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData {
        int monto;
        try {
            monto = Integer.parseInt(montoStr);
        }catch (NumberFormatException ex){
            System.out.println("Formato Invalido en ("+montoStr+"): " + ex.getMessage());
            return false;
        }
        Movimiento gasto = new Gasto(nombre,
                moneda,
                categoria,
                monto);
        return this.repository.save(gasto.getDetails());
    }
    @Override
    public void getMovimientos() {
        this.repository.read();
    }
    @Override
    public void getGastos() {
        this.repository.read();
    }

}

