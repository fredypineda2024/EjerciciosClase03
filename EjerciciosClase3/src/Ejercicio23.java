/*
 * Realizar un programa que imprima un diamante usando 
 * caracteres de texto. El programa debe pedir al usuario
 *  el tamaño del diamante, el cual debe ser un número
 *  entero positivo impar. 
Ej:
- Si tamaño es: 3
    ```
     *
    ***
     *
    ```
- Si tamaño es: 7
    ```
       *
      ***
     *****
    *******
     *****
      ***
       *
    ```
Ten en cuenta que la linea de asteriscos (*) de la
 fila central es la mas grande y debe estar alineada a
  la parte izquierda de la pantalla y debe tener del 
  tamaño del número dado. El resto de las lineas deben
   quedar los asteriscos centrados teniendo como base la 
   linea central.
En caso de que el número ingresado no sea válido, se le
 debe informar el usuario el caso que no está cumpliendo.
 * 
 * 
 */

package src;
import java.util.Scanner;
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del diamante (entero positivo impar): ");
        int tamaño = scanner.nextInt();
        
        // Validación de entrada
        if (tamaño <= 0 || tamaño % 2 == 0) {
            System.out.println("El número debe ser un entero positivo impar.");
            scanner.close();
            return;
        }

        // Parte superior del diamante
        int mitad = tamaño / 2; // posición central del diamante
        for (int i = 0; i <= mitad; i++) {
            // Imprimir espacios
            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        // Parte inferior del diamante
        for (int i = mitad - 1; i >= 0; i--) {
            // Imprimir espacios
            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
        scanner.close();
    }
    
}
