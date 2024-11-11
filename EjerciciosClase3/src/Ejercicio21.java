/*
 * Realizar un programa que permita hacer la siguiente conversión:
- Millas a kilómetros. 
- Kilómetros a millas. 

Considera que  
- 1 milla son 1.60934 kilómetros  
- 1 kilómetro es 0.621371 millas
 * 
 */

package src;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Millas a Kilómetros");
        System.out.println("2. Kilómetros a Millas");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad en millas: ");
            double millas = scanner.nextDouble();
            double kilometros = millas * 1.60934;
            System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad en kilómetros: ");
            double kilometros = scanner.nextDouble();
            double millas = kilometros * 0.621371;
            System.out.println(kilometros + " kilómetros equivalen a " + millas + " millas.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
    
}
