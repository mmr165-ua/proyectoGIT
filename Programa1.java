/*
 * MARIO MARTI RUBIO
 * Programa prueba para incluirlo dentro de la carpeta del Proyecto de GIT
 */


import java.util.Scanner;

public class Programa1{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        float n1,n2;
        int operacion;

        System.out.print("Introduce el primer numero: ");

        while(!lector.hasNextFloat()){
            lector.nextLine();
            System.out.print("Introduce el primer numero (correctamente): ");
        }

        n1=lector.nextFloat();
        lector.nextLine();

        System.out.print("Introduce el segundo numero: ");
    
        while(!lector.hasNextFloat()){
            lector.nextLine();
            System.out.print("Introduce el segundo numero (correctamente): ");
        }

        n2=lector.nextFloat();
        lector.nextLine();

        System.out.print("\nOPERACIONES\n-----------\n  1. Suma\n  2. Resta\n  3. Multiplicación\n  4. División\n\nOperación a realizar: ");

        while(!lector.hasNextInt() || (operacion=lector.nextInt())>4 || operacion<1){
            lector.nextLine();
            System.out.print("Operación incorrecta. Introduce una opción válida: ");
        }

        if(operacion==4 && n2==0)
            System.out.println("No se puede realizar esta operación. No se puede dividir entre cero.");
        else{
            switch (operacion){
                case 1: System.out.println("Resultado de la suma de " + n1 + " mas " + n2 + " es igual a " + (n1+n2)); break;
                case 2: System.out.println("Resultado de la resta de " + n1 + " menos " + n2 + " es igual a " + (n1-n2)); break;
                case 3: System.out.println("Resultado de la multiplicación de " + n1 + " por " + n2 + " es igual a " + n1*n2); break;
                default: System.out.println("Resultado de la división de " + n1 + " entre " + n2 + " es igual a " + n1/n2); break;
            }
        }
        

        lector.close();
    }
}