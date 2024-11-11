
//Escriba un programa que permita ingresar un número
// y determine si es divisible por dos y siete.


package src;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        // Verificar si el número es divisible por 2 y 7
        if (numero %2==0 && numero%7==0){
            System.out.println("El numero ES divisible por dos y siete");

        }else {
            System.out.println("El numero NO es divisible por dos y siete");

        }
                // Cerrar el objeto Scanner
        scanner.close();
    }
}
