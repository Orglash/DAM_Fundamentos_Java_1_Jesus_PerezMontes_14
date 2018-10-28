package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos la calificacion por consola
        System.out.println("Introduzca la puntuación obtenida entre 0 y 10:\n");
        Scanner sc=new Scanner(System.in);
        int puntuacion=sc.nextInt();
        while(puntuacion<0||puntuacion>10) {
            System.out.println("Introduzca la puntuación obtenida entre 0 y 10:\n");
            puntuacion=sc.nextInt();
        }
        //El valor de la variable nota como "PENDIENTE" es porque si no, en el printf final, da error de variable no inicializada.
        String nota="PENDIENTE";
        //Si la puntuacion es mayor de 5, el case nos devuelve la calificacion apropiada, si es menor de 5, devuelve automaticamente el "INSUFICIENTE"
        if (puntuacion >= 5) {
            switch (puntuacion){
                case 5:
                    nota = "SUFICIENTE";
                    break;
                case 6:
                    nota= "BIEN";
                    break;
                case 7:
                    nota= "NOTABLE";
                    break;
                case 8:
                    nota= "NOTABLE";
                    break;
                case 9:
                    nota= "SOBRESALIENTE";
                    break;
                case 10:
                    nota= "SOBRESALIENTE";
                    break;
            }
        } else {
            nota="INSUFICIENTE";
        }
        //Imprimimos el resultado.
        System.out.printf("La calificacion obtenida es:\n%s", nota);
    }
}
