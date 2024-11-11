//Un vendedor al por mayor de camisas ofrece diferentes 
//precios de acuerdo a la cantidad de unidades que le
//compren. La siguiente tabla muestra la información: 
/* 
| Unidades | Precio por unidad |
| :-: | --: |
|[1 - 50] | $50.000 |
|(50 - 100] | $45.000 |
|(100 - 150] | $40.000 |
|(150 - 200] | $35.000 |
|> 200 | $25.000 |
*/
//Escriba un programa que dado un número de camisas retorne
// el precio por unidad.



package src;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Solicitar al usuario que ingrese el número de camisas
        System.out.println("Ingrese el numero de camisas que desea comprar: ");
        int camisas=scanner.nextInt();
        // Variable para almacenar el precio por unidad
        int precioPorUnidad;


        // Determinar el precio por unidad según el número de camisas
        if (camisas >= 1 && camisas <= 50) {
            precioPorUnidad = 50000;
        } else if (camisas > 50 && camisas <= 100) {
            precioPorUnidad = 45000;
        } else if (camisas > 100 && camisas <= 150) {
            precioPorUnidad = 40000;
        } else if (camisas > 150 && camisas <= 200) {
            precioPorUnidad = 35000;
        } else if (camisas > 200) {
            precioPorUnidad = 25000;
        } else {
            System.out.println("Cantidad de camisas no válida.");
            scanner.close();
            return; // Salir del programa si el número ingresado es inválido
        }

        // Mostrar el precio por unidad
        System.out.println("El precio por unidad es: $" + precioPorUnidad);

        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
