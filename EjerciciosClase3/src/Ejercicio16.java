/*
 * Escriba un programa que permita ingresar un número mientras estos sean negativos.
 *  Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad 
 * de números negativos ingresados.
 */


package src;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner para leer la entrada del usuario
        int contadorNegativos = 0;  // Variable para contar la cantidad de números negativos ingresados
        int numero;  // Variable para almacenar el número ingresado

        // Bucle que continúa mientras se ingresen números negativos
        do {
            System.out.print("Ingrese un número negativo (o un número positivo para detener): ");
            numero = scanner.nextInt();  // Leer el número ingresado por el usuario

            // Si el número es negativo, incrementamos el contador
            if (numero < 0) {
                contadorNegativos++;
            }
        } while (numero < 0);  // Condición para repetir el bucle si el número es negativo

        // Mostrar la cantidad de números negativos ingresados
        System.out.println("Cantidad de números negativos ingresados: " + contadorNegativos);
        
        scanner.close();  // Cerramos el Scanner para liberar los recursos
    }
    
}
