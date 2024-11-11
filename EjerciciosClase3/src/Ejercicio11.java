/*Escriba una función en la que pueda ingresar tres números
 enteros y diferentes. Imprima estos valores en orden ascendente.  
Por ejemplo:
```
Input : 3 , 100 , 1
Output : 13100
```
Tenga en cuenta que la respuesta es un texto. Los números los puede concatenar.
 */


package src;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingres el primer numero: ");
        int num1=scanner.nextInt();

        System.out.println("Ingres el segundo numero: ");
        int num2=scanner.nextInt();

        System.out.println("Ingres el tercer numero: ");
        int num3=scanner.nextInt();
        // Llamar a la función para ordenar y concatenar
        String resultado = ordenarYConcatenar(num1, num2, num3);
        System.out.println("Números en orden ascendente: " + resultado);

        scanner.close();

    }
    public static String ordenarYConcatenar(int num1, int num2, int num3) {
        int menor, medio, mayor;

        // Comparaciones para encontrar el orden ascendente
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        // Concatenar los números en orden ascendente
        return Integer.toString(menor) + Integer.toString(medio) + Integer.toString(mayor);
    }
}
