//Escriba una función en la que ingrese un número entero 
//entre 1 y 12. Este número corresponde con un mes 
//(1 enero, 2 febrero, ..., 12 diciembre). El resultado debe 
//ser el número de días del mes ingresado.  

/*Ejemplo:  
```
Input : 12
Output : 31
```

A continuación encuentras la cantidad de días que tienen 
cada mes.

| Mes | Días |
| :-: | :-: |
| 1, 3, 5, 7, 8, 10 y 12 | 31 |
| 4, 6, 9, 11 | 30 |
|2 | 28 |
*/


package src;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de mes
        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();

        // Llamar a la función para obtener el número de días y mostrar el resultado
        int dias = obtenerDiasDelMes(mes);
        
        if (dias != -1) {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes no válido.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para obtener el número de días de un mes dado
    public static int obtenerDiasDelMes(int mes) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 2) {
            return 28;
        } else {
            return -1; // Devuelve -1 si el número de mes es inválido
        }
    }
    
}
