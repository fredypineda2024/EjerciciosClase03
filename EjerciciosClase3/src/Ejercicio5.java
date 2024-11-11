//Escriba un programa que permita ingresar
// una letra e identifique si es vocal o consonante.


package src;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una letra
        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        // Verificar si el carácter es una letra
        if (Character.isLetter(letra)) {
            // Verificar si es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra es una vocal.");
            } else {
                System.out.println("La letra es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
    

