package com.Presupuesto.entidades;

import java.util.Date;

public abstract class Movimiento {


    //hacerlos privados para evitar manipulación de terceros. Nadie lo ve y no sale en el main, se crean get y set
    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    //Constructor
    public Movimiento(String nombre, String moneda, String categoria, int monto) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date(); //pone el momento actual
    }

    //Metodo es el Abstracto
    public abstract String getDetails();


    // Defaults Gets
    String getNombre(){
        return this.nombre;
    }

    String getMoneda() {
        return moneda;
    }

    String getCategoria() {
        return categoria;
    }

    int getMonto() {
        return monto;
    }

    Date getFecha() {
        return fecha;
    }
}
