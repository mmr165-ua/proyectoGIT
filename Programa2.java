/*
 * MARIO MARTI RUBIO
 * Programa prueba para incluirlo en la carpeta del proyecto de GIT
 */

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        float nota;

        System.out.print("Introduce tu nota: ");

        while(!lector.hasNextFloat() || (nota=lector.nextFloat())<0 || nota>10){
            lector.nextLine();
            System.err.print("Valor incorrecto, introduzca una nota entre 0 y 10: ");
        }

        if(nota<5)
            System.out.println("SUSPENSO.");
        else if(nota<7)
            System.out.println("APROBADO");
        else if(nota<9)
            System.out.println("NOTABLE");
        else
            System.out.println("SOBRESALIENTE");


        lector.close();    
    }
}
