package com.Presupuesto.entidades;

public class Ingreso extends Movimiento {
//paquetes minuscula y clases MAYUSCULA

    private String perioricidad; //esto en caso de tener atributos de la clase nada más

    //aquí estaban los parámetros, fueron borrados por herencia, clase movimiento sería la base en este caso.

    //Constructor
    public Ingreso(String nombre, String moneda, String categoria, int monto, String perioricidad) {
        super(nombre, moneda, categoria, monto);
        this.perioricidad = perioricidad;
        /*para hacer referencia al constructor de la clase que estoy heredando.
        En caso de tener un constructor con parámetros. Puedo quitar atributos porque ya existe en clase base*/
    }

    /*@Override
    public String getNombre() { //esto es polimorfismo, retorna nombre pero agrega perioricidad
        return super.getNombre() + " " + this.perioricidad; //estoy llamando a get nombre y voy apuntar perioricidad
    }*/

    @Override
    public String getDetails() {
        return "INGRESO: " + this.getNombre() + " - " + this.getMoneda() + " - " + this.getCategoria() + " - " + this.getMonto() + " - " + this.perioricidad;
    }
}

