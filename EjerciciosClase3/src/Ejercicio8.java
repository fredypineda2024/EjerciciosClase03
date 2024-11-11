
//Escriba un programa que permita ingresar 
//un número (va a representar la cantidad de años) 
//y de como respuesta la etapa en la que se encuentra
// la persona de acuerdo con la siguiente tabla.

//| Años | Etapas |
//| :-: | --- |
//| 0 - 5 | Primera infancia |
//| 6 - 11 | Infancia |
//| 12 - 18 | Adolescencia |
//| 19 - 26 | Juventud |
//| 27 - 59 | Adultez |
//|> 59 | Persona mayor |

package src;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número que represente la cantidad de años
        System.out.print("Ingresa la cantidad de años: ");
        int edad = scanner.nextInt();

                // Determinar la etapa de la vida según la cantidad de años ingresados
                if (edad>=0 && edad <=5){
                    System.out.println("Primera infancia");
                }else if (edad>=6 && edad <=11){
                    System.out.println("Infancia");
                } else if (edad >= 12 && edad <= 18) {
                    System.out.println("Adolescencia");
                } else if (edad >= 19 && edad <= 26) {
                    System.out.println("Juventud");
                } else if (edad >= 27 && edad <= 59) {
                    System.out.println("Adultez");
                } else if (edad > 59) {
                    System.out.println("Persona mayor");
                } else {
                    System.out.println("Edad no válida");
                }
        
                // Cerrar el objeto Scanner
                scanner.close();



    }
}
