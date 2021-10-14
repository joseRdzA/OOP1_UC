package com.Presupuesto.entidades;


public class Gasto extends Movimiento {

    //Se hizo lo mismo que en ingreso, sin agregar otro atributo

    //Constructor
    public Gasto(String nombre, String moneda, String categoria, int monto) {

        super(nombre, moneda, categoria, monto);
    }

    @Override
    public String getDetails() {
        return "GASTO: " + this.getNombre() + " - " + this.getMoneda() + " - " +  this.getCategoria() + " - " + this.getMonto();
    }

}
