package com.Presupuesto.repo;

public class ErrorMuyPocaData extends Exception{
    public ErrorMuyPocaData(String error){
        super("Este elemento a guardar es muy pequeño: " + error);
    }
}
