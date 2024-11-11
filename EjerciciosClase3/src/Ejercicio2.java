//Escriba un programa que le permita ingresar
// tres números e imprima en la consola el más grande 
//de ellos.



package src;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
  // Solicitar al usuario que ingrese tres números
        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();
 // Determinar el número más grande
        int mayor;

        if (numero1 >= numero2 && numero1 >= numero3){
            mayor = numero1;
        }else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
            
        }else {
            mayor = numero3;
        }
 // Imprimir el número más grande
System.out.println("El numero mas grande es: " + mayor);
  // Cerrar el objeto Scanner
scanner.close();


    }
}
