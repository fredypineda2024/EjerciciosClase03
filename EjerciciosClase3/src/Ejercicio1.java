//Escriba un programa que permita ingresar un número real e identifique si el número es negativo, 
//positivo o cero.


package src;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número real
        System.out.print("Ingresa un número real: ");
        double numero = scanner.nextDouble();

        // Identificar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}