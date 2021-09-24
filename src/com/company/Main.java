package com.company;

public class Main {

    static String metodo(String variable) {
        //static para poder referenciarlo en el main
        variable = variable + "Mundo";
        return variable;

    }

    public static void main(String[] args) {
        System.out.println("hola clase");
    /*
    Variables
    Type nombre = valor;*/

        String variable = "hola";
        variable = metodo(variable);


        int entero = 2;
        int edad = 18;
        float flotante = 2.5f;
        String cadenaCaracteres = "2";
        Integer entero2 = 2;
        Boolean siOno = true;

        System.out.println(cadenaCaracteres);
        System.out.println("------------------------------------");
        System.out.println(Integer.parseInt(cadenaCaracteres) + entero);
        System.out.println("------------------------------------");
        System.out.println(Integer.parseInt(cadenaCaracteres));
        System.out.println("------------------------------------");
//Int a integer, uno es primitivo y el otro orientación
//Condicionales
        if (entero == 2) {
            System.out.println("Es el numero correcto");
        } else {
            System.out.println("No es el numero correcto");
        }

        if (edad>= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        if (entero == 2) {
            System.out.println("Es el numero correcto, else if");
        } else if (entero == 3) {
            System.out.println("No es el numero correcto");
        } else {
            System.out.println("Que fue lo que puso?");
        }

        switch (entero) {
            case 1:
                System.out.println("Si es uno");
                System.out.println("Que si es uno");
                break;
            default:
                System.out.println("Default");
        }

        //Loops
        int i = 0;
        while (i < 10){
            System.out.println("Por aqui voy: " + i);
            i = i + 1;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Por aqui va el otro: " + j);
        }


        /*for(int j = 0; j<10; j++){
            System.out.println("Por aquí va el otro" + j);
        }*/

        //Arrays

        String[] objetos = {"Un objeto", "Dos objetos"};
        System.out.println("Que tiene el 0: " + objetos[0]);


    }
}
//format control + alt + l
