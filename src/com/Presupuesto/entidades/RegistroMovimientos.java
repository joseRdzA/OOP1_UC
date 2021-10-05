package com.Presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroMovimientos {

    List<Movimiento> movimientos;

    //constructor
   public RegistroMovimientos() {
      this.movimientos = new ArrayList<>();
   }

   //metodo 1
   public List<Movimiento> getMovimientos() {
      return this.movimientos;
   }

   public List<Gasto> getGastos(){ //sacar de la lista solo los gastos.
      List<Gasto> respuesta = new ArrayList<>();
      for(Movimiento movimiento : this.movimientos){
         if(movimiento instanceof Gasto ){ //este objeto es una instancia de que?
            respuesta.add((Gasto) movimiento);
         }
      }
      return respuesta;
   }

   //metodo 2
   public void addMovimiento(Movimiento item){
      this.movimientos.add(item);

   }
}

