//Escriba un programa que permita ingresar 
//una letra e identifique si la letra es mayúscula
// o minúscula.


package src;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese una letra
        System.out.println("Ingresa una letra: ");
        char letra=scanner.next().charAt(0);
        // Verificar si la letra es mayúscula o minúscula
        if (Character.isUpperCase(letra)){
            System.out.println("La letra es mayuscula");
        }else if (Character.isLowerCase(letra)) {
           System.out.println("La letra es minuscula"); 
        }else {
            System.out.println("El caracter ingresado no es una letra");
        }
        scanner.close();
    }
    
}
