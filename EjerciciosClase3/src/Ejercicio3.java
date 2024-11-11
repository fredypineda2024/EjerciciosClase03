//Escriba un programa que permita ingresar
// un número e identificar si es par o impar.



package src;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

                // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un mumero entero: ");
int numero=scanner.nextInt();

        // Determinar si el número es par o impar
if (numero%2 ==0){
    System.out.println("El numero es par");

}else{
    System.out.println("El numero es impar");
}
        // Cerrar el objeto Scanner
scanner.close();
    }
    
}
