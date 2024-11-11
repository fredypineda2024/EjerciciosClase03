/*Realice un programa en el que ingrese un número y
 muestre el cubo. Repita el proceso hasta que se
  introduzca un valor negativo.
 */

package src;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner para leer la entrada del usuario
        int numero;  // Declaramos una variable 'numero' para almacenar el valor ingresado por el usuario

        // Usamos un bucle 'do-while' para repetir el proceso de entrada y cálculo
        do {
            System.out.print("Ingrese un número para calcular su cubo (número negativo para salir): ");
            numero = scanner.nextInt();  // Leemos el valor entero ingresado por el usuario

            // Condición para calcular y mostrar el cubo solo si el número no es negativo
            if (numero >= 0) {
                int cubo = numero * numero * numero;  // Calculamos el cubo del número
                System.out.println("El cubo de " + numero + " es: " + cubo);  // Mostramos el resultado
            }

        } while (numero >= 0);  // Continuamos el bucle mientras el número sea no negativo
        
        scanner.close();  // Cerramos el objeto Scanner para liberar recursos
        System.out.println("Programa finalizado.");  // Mensaje final indicando que el programa ha terminado
    }
    
}
