/*
 * Esta sucesión comienza con los números 0 y 1. El siguiente miembro
 *  se calcula como la suma de los dos inmediatamente anteriores.  
Crea un programa reciba un número (N) del usuario y muestre
 los primeros N números de sucesión.
 * 
 */

package src;
import java.util.Scanner;;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número (N) para ver los primeros N números de la sucesión de Fibonacci: ");
        int N = scanner.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        
        System.out.print("Sucesión de Fibonacci: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(num1 + " ");
            
            // Calcular el siguiente número en la sucesión
            int siguienteNumero = num1 + num2;
            num1 = num2; // Actualizar num1 al valor de num2
            num2 = siguienteNumero; // Actualizar num2 al siguiente número
        }
        
        scanner.close();
    }
    
}
