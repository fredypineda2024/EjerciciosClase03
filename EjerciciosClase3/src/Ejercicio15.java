/*Escriba un programa en el que ingrese un número 
y le diga si es positivo o negativo. Repita el proceso
 hasta que se ingrese el número cero.
 */



package src;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner para leer la entrada del usuario
        int numero;  // Declaramos una variable para almacenar el número ingresado por el usuario

        // Bucle que continuará ejecutándose hasta que el usuario ingrese el número cero
        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();  // Leemos el número entero ingresado por el usuario

            // Verificamos si el número es positivo o negativo
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            }
            // Si el número es cero, el bucle se detiene y no se imprime nada en esta iteración

        } while (numero != 0);  // La condición del bucle es que el número no sea cero

        // Cerrar el Scanner después de que el bucle termina
        scanner.close();
        System.out.println("Programa finalizado.");  // Mensaje final que indica que el programa ha terminado
    }
    
}
