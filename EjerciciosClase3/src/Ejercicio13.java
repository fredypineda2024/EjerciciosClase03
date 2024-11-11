
/*Tres hermanos acuerdan reunirse. Los hermanos son 
identificados por los siguientes números: 1 para el mayor, 
2 para el del medio y 3 para el menor.  
Cuando llega la hora de la reunión, uno de los hermanos
 va tarde. Dados los números de los hermanos que llegan a 
 tiempo, determine el número del hermano que llegará tarde.  
Por ejemplo:
```
Input : 1 2
Output : 3
```
El tercer hermano es el el que llegara a la reunión tarde.
 * 
 */

package src;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número de los dos hermanos que llegaron a tiempo
        System.out.print("Ingrese el número del primer hermano que llegó a tiempo 1,2 o 3: ");
        int hermano1 = scanner.nextInt();
        System.out.print("Ingrese el número del segundo hermano que llegó a tiempo 1,2 o 3 : ");
        int hermano2 = scanner.nextInt();
        
        // Determinar el número del hermano que llegó tarde
        int hermanoTarde = 6 - (hermano1 + hermano2);
        
        // Imprimir el resultado
        System.out.println("El hermano que llegó tarde es: " + hermanoTarde);
        
        scanner.close();
    }
    
}
