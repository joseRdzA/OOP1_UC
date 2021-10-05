package com.Presupuesto.entidades;

import java.util.Date;

public class Movimiento {
//paquetes minuscula y clases MAYUSCULA

    //hacerlos privados para evitar manipulación de terceros. Nadie lo ve y no sale en el main, se crean get y set
    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    //Constructor
    public Movimiento(String nombre, String moneda, String categoria, int monto){
        this.nombre = nombre;
        this.moneda=moneda;
        this.categoria=categoria;
        this.monto=monto;
        this.fecha=new Date(); //pone el momento actual
    }

    public String getNombre() {
        return this.nombre;
    }
}
